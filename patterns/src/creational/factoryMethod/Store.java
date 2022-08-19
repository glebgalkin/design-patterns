package creational.factoryMethod;

public abstract class Store {

    void openStore(){
        Product product = createProduct();
        System.out.print("The store has finally opened!");
        product.writeColor();
        product.writeSize();
    }

    public abstract Product createProduct();

}
