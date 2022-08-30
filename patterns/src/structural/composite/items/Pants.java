package structural.composite.items;

import structural.composite.items.BaseItem;

public class Pants extends BaseItem {

    private int length;

    public Pants(int price, int warranty, int length) {
        super(price, warranty);
        this.length = length;
    }
}
