package su.msk.jet.test.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ItemData {
    private String pictureName;
    private String description;
    private String price;
    private Long id;

    public ItemData(String pictureName, String description, String price) {
        this.pictureName = pictureName;
        this.description = description;
        this.price = price;
    }

    public ItemData() {
    }

    public String getPictureName() {
        return pictureName;
    }

    public String getDescription() {
        return description;
    }

    public String getPrice() {
        return price;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(String price) {
        this.price = price;
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
