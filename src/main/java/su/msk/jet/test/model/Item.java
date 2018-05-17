package su.msk.jet.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
    private String name;
    private String description;
    private int productId;
    private Long id;

    public Item() {
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getProductId() {
        return productId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public Item(String name, String description, int productId) {
        this.name = name;
        this.description = description;
        this.productId = productId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
