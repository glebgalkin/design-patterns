package creational.abstractFactory.phone;

import creational.abstractFactory.phone.Phone;

public class AppleIphone implements Phone {

    private static final String phoneName = "APPLE_IPHONE_4S";
    private static final String releaseYear = "2021";

    @Override
    public void getPhoneName() {
        System.out.println("Phone name: "+ phoneName);
    }

    @Override
    public void getReleaseYear() {
        System.out.println("Release year: "+ releaseYear);
    }
}
