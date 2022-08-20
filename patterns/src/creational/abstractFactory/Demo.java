package creational.abstractFactory;

public class Demo {

    private static TechFactory techFactory;

    public static void main(String[] args) {
        configureTechFactory();
    }

    public static void configureTechFactory(){
        techFactory = new SamsungFactory();
    }
}
