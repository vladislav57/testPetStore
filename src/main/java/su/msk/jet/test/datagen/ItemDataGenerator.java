package su.msk.jet.test.datagen;

import org.springframework.beans.factory.annotation.Autowired;
import su.msk.jet.test.model.ItemData;

import java.util.ArrayList;
import java.util.List;

public class ItemDataGenerator {
    private List<ItemData> list;

    public ItemDataGenerator() {
        /*ItemData data1 = new ItemData("fish1", "Large", "10.0 $");
        ItemData data2 = new ItemData("fish1", "Toothless", "10.0 $");
        this.list = Arrays.asList(data1, data2);*/
    }

    public void setList(List<ItemData> list) {
        this.list = list;
    }

    public List<ItemData> getList() {

        return list;
    }
}
