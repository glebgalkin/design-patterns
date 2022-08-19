package creational.factoryMethod;

public class Demo {

    private static Store store;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        store = new DressStore();
    }

    static void runBusinessLogic(){
        store.openStore();
    }
}
