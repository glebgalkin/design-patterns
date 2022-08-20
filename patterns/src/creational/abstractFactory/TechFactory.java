package creational.abstractFactory;

import creational.abstractFactory.laptop.Laptop;
import creational.abstractFactory.phone.Phone;

public interface TechFactory {
    void createPhone();
    void createLaptop();
}
