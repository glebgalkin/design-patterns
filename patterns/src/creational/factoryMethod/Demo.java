package creational.factoryMethod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
