package structural.composite;

import structural.composite.items.Item;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cart {
    private List<Item> itemList = new ArrayList<>();

    public Cart(Item...items){
        this.itemList.addAll(Arrays.asList(items));
    }

    public int calculateTotal(){
        int total = 0;
        for(Item item:itemList){
            total += item.getPrice();
        }
        return total;
    }

}
