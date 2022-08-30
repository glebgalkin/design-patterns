package structural.composite;

import java.util.List;

public class Bundle extends BaseItem{

    private List<Item> itemList;

    public Bundle(int price, int warranty, List<Item> itemList) {
        super(price, warranty);
        this.itemList = itemList;
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
