package creational.factoryMethod;

public class DressProduct implements Product{
    @Override
    public void writeColor() {
        System.out.print("Regular dress color: red");
    }

    @Override
    public void writeSize() {
        System.out.print("Regular dress size: 12");
    }
}
