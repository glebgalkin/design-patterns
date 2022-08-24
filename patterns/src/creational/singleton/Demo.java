package creational.singleton;

public class Demo {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("someValue");

        System.out.println(singleton.value);
    }
}
