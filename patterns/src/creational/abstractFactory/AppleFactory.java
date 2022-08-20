package creational.abstractFactory;

import creational.abstractFactory.laptop.AppleMac;
import creational.abstractFactory.laptop.Laptop;
import creational.abstractFactory.phone.AppleIphone;
import creational.abstractFactory.phone.Phone;

public class AppleFactory implements TechFactory{

    private AppleIphone phone;
    private AppleMac appleMac;

    public AppleFactory(){
        createPhone();
        createLaptop();
    }

    @Override
    public void createPhone() {
        phone = new AppleIphone();
        phone.getPhoneName();
        phone.getReleaseYear();
    }

    @Override
    public void createLaptop() {
        appleMac = new AppleMac();
        appleMac.getLaptopModel();
        appleMac.getLaptopResolution();
    }
}
