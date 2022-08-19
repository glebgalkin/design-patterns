package creational.factoryMethod;

public class DressStore extends Store{

    @Override
    public Product createProduct() {
        return new DressProduct();
    }
}
