package structural.composite.items;

import structural.composite.items.BaseItem;

public class Heals extends BaseItem {

    private String color;

    public Heals(int price, int warranty, String color) {
        super(price, warranty);
        this.color = color;
    }

}
