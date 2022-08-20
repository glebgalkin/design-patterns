package creational.abstractFactory.laptop;

import creational.abstractFactory.laptop.Laptop;

public class SamsungPC implements Laptop {
    @Override
    public void getLaptopModel() {
    System.out.println("Samsung laptop model: 34dd");
    }

    @Override
    public void getLaptopResolution() {
        System.out.println("Samsung laptop resolution: 14 inch");
    }
}
