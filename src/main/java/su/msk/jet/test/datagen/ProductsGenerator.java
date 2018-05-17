package su.msk.jet.test.datagen;

import su.msk.jet.test.model.Item;

import java.util.Arrays;
import java.util.List;

public class ProductsGenerator {
    private List<Item> fish;

    public ProductsGenerator() {
        Item item = new Item("Angelfish", "Saltwater fish from Australia", 1000);
        Item item2 = new Item("Tiger Shark", "Saltwater fish from Australia", 1001);
        Item item3 = new Item("Koi", "Freshwater fish from Japan", 1002);
        Item item4 = new Item("Goldfish", "Freshwater fish from China", 1003);
        this.fish = Arrays.asList(item, item2, item3, item4);
    }

    public List<Item> getProducts() {
        return fish;
    }

    public void setFish(List<Item> fish) {
        fish = fish;
    }
}
