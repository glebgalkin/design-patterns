package structural.composite;

public abstract class BaseItem implements Item{
    private int price;
    private int warranty;

    public BaseItem(int price, int warranty) {
        this.price = price;
        this.warranty = warranty;
    }

    public BaseItem(){};

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public int getWarranty() {
        return warranty;
    }

    @Override
    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
