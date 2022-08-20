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

//        List<String> stringList = Arrays.asList("SE", "HEE", "heeeeee", "lwjnlwd", "ewkhwihe", "wrefjwrouhfoiwh");
//        Stream<String> stringStream = stringList.stream();
//        String result = stringStream.filter(string -> string.length() < 4).reduce("SUCKAAA", (a,b) -> a + b);
//        System.out.println(result);
    }

    static void configure(){
        store = new DressStore();
    }

    static void runBusinessLogic(){
        store.openStore();
    }
}
