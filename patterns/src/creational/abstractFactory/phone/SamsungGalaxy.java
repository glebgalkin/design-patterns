package creational.abstractFactory.phone;

import creational.abstractFactory.phone.Phone;

public class SamsungGalaxy implements Phone {

    @Override
    public void getPhoneName() {
        System.out.println("SAMSUNG GALAXY 3G");
    }

    @Override
    public void getReleaseYear() {
        System.out.println("SAMSUNG GALAXY 3G");
    }
}
