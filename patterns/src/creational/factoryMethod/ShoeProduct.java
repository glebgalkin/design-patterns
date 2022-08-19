package creational.factoryMethod;

public class ShoeProduct implements Product{
    @Override
    public void writeColor() {
        System.out.print("Regular shoe color: blue");
    }

    @Override
    public void writeSize() {
        System.out.print("Regular shoe size: 48");
    }
}
