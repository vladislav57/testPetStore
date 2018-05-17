package su.msk.jet.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import su.msk.jet.test.datagen.ProductsGenerator;
import su.msk.jet.test.model.ItemData;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
@EnableJpaRepositories
public class ShoppingController {

    @Autowired
    EntityManagerFactory emf;

    @RequestMapping("/index")
    public String index() {
        return "main";
    }

    @RequestMapping("/showproducts")
    public ModelAndView products(@RequestParam(value = "categoryName") String categoryName, HttpSession session) {
        session.setAttribute("categoryName", categoryName);
        ProductsGenerator productsGenerator = new ProductsGenerator();
        return new ModelAndView("showproducts", "products", productsGenerator.getProducts());
    }

    @RequestMapping("/showitems")
    public ModelAndView items(@RequestParam(value = "productId") String productId, HttpSession session) {
        String ItemDescription = "Should take description from database by id";
        session.setAttribute("ItemDescription", ItemDescription);
        /*ItemDataGenerator dataGenerator = new ItemDataGenerator();
        return new ModelAndView("showitems", "items", dataGenerator.getList());*/
        List<ItemData> list = new ArrayList<>();
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<ItemData> cq = cb.createQuery(ItemData.class);
        Root<ItemData> itemDataRoot = cq.from(ItemData.class);
        cq.select(itemDataRoot);
        cq.from(ItemData.class);
        list = em.createQuery(cq).getResultList();
        em.getTransaction().commit();
        em.flush();
        em.close();
        return new ModelAndView("showitems", "items", list);
    }

}
