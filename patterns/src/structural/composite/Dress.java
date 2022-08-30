package structural.composite;

public class Dress extends BaseItem{

    private String type;

    public Dress(int price, int warranty, String type) {
        super(price, warranty);
        this.type = type;
    }
}
