package su.msk.jet.test.jpa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

@Configuration
public class EntityManagerFactoriesConfiguration {

    @Bean(name = "entityManagerFactory")
    public LocalContainerEntityManagerFactoryBean emf() {
        LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
        emf.setPersistenceXmlLocation("META-INF/persistence.xml");
        emf.setPackagesToScan("su.msk.jet.test.jpa", "su.msk.jet.test.controller", "su.msk.jet.test.model");
        emf.setPersistenceUnitName("su.msk.jet.test.persistence");
        emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        return emf;
    }
}
