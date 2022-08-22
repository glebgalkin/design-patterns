package creational.builder.director;

import creational.builder.builder.Builder;
import creational.builder.model.Plane;
import creational.builder.model.PlaneType;
import creational.builder.model.components.Engine;

import java.util.Arrays;

public class Director {
    public void constructRegularPlane(Builder builder){
        builder.type(PlaneType.REGULAR);
        builder.setEngine(new Engine("Airbus-777"));
        builder.setSeatsNumber(140);
        builder.setProportions(Arrays.asList("23", "45"));
    };

    public void constructMilitaryPlane(Builder builder){
        builder.type(PlaneType.MILITARY);
        builder.setEngine(new Engine("M-55"));
        builder.setSeatsNumber(2);
        builder.setProportions(Arrays.asList("11", "22", "122"));
    };
}
