package creational.builder;

import creational.builder.builder.Builder;
import creational.builder.builder.PlaneBuilder;
import creational.builder.director.Director;
import creational.builder.model.Plane;

public class Demo {

    private static PlaneBuilder builder;
    private static Director director;

    public static void main(String[] args) {
        builder = new PlaneBuilder();
        director = new Director();

        director.constructRegularPlane(builder);
        Plane regular = builder.getPlane();
        System.out.println("Regular plane built: " + regular.toString());

        director.constructMilitaryPlane(builder);
        Plane military = builder.getPlane();
        System.out.println("Regular plane built: " + military.toString());
    }
}
