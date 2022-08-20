package creational.abstractFactory;

import creational.abstractFactory.laptop.SamsungPC;
import creational.abstractFactory.phone.SamsungGalaxy;

public class SamsungFactory implements TechFactory{

    private SamsungGalaxy samsungGalaxy;
    private SamsungPC samsungPC;

    public SamsungFactory(){
        createPhone();
        createLaptop();
    }

    @Override
    public void createPhone() {
    samsungGalaxy = new SamsungGalaxy();
    samsungGalaxy.getPhoneName();
    samsungGalaxy.getReleaseYear();
    }

    @Override
    public void createLaptop() {
        samsungPC = new SamsungPC();
        samsungPC.getLaptopModel();
        samsungPC.getLaptopResolution();
    }
}
