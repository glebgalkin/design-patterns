package creational.prototype;

import java.util.Objects;

public class Demo {

    public static void main(String[] args) {
        Focal focal1 = new Focal("KG-5", 2000);
        Focal focal2 = (Focal) focal1.clone();

        System.out.println("Memory placement comparison: " +  (focal1==focal2));
        System.out.println("Data comparison: " +  (Objects.equals(focal1, focal2)));
    }
}
