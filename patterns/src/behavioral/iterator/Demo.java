package behavioral.iterator;

import java.lang.reflect.Array;
import java.util.*;

public class Demo {

    public static void main(String[] args) {
        List<Donut> donutList = Arrays.asList(new Donut(21, "Adidas"), new Donut(1, "H&M"));
        DonutIterator di = new DonutIterator(donutList);
        while(di.hasNext()){
            System.out.println(di.getCurrentPosition());
            System.out.println(di.getNext().getBrandName());
        }
    }
}
