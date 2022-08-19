package creational.factoryMethod;

public class ShoeStore extends Store{
    @Override
    public Product createProduct() {
        return new ShoeProduct();
    }
}
