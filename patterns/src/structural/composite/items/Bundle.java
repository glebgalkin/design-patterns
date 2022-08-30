package structural.composite.items;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bundle extends BaseItem {

    private List<Item> itemList = new ArrayList<>();

    public Bundle(int price, int warranty) {
        super(price, warranty);
    }

    public Bundle(Item... items){
        itemList.addAll(Arrays.asList(items));
    }

    @Override
    public int getPrice(){
        int price = 0;
        for (Item item : itemList){
            price += item.getPrice();
        }
        return price;
    }
}
