package structural.composite;

import structural.composite.items.Bundle;
import structural.composite.items.Dress;
import structural.composite.items.Heals;
import structural.composite.items.Pants;

public class Demo {

    public static void main(String[] args) {
        Cart cart = new Cart(
                new Dress(25, 2, "Latina"),
                new Heals(40,1,"black"),
                new Pants(55, 3, 42),
                new Bundle( new Dress(30, 2, "Standart"),
                        new Heals(59,1,"white"),
                        new Pants(77, 31, 40))
        );

        System.out.println("Total cart value: " + cart.calculateTotal());
    }
}
