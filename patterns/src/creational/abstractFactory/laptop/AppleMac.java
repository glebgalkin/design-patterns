package creational.abstractFactory.laptop;

public class AppleMac implements Laptop {
    @Override
    public void getLaptopModel() {
        System.out.println("Apple laptop model: macbookpro");
    }

    @Override
    public void getLaptopResolution() {
        System.out.println("Apple laptop resolution: 16 inch");
    }
}
