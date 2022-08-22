package creational.builder.builder;

import creational.builder.model.PlaneType;
import creational.builder.model.Plane;
import creational.builder.model.components.Engine;

import java.util.List;

public class PlaneBuilder implements Builder {

    private PlaneType type;
    private Engine engine;
    private int seats;
    private List proportions;

    @Override
    public void type(PlaneType type) {
        this.type = type;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setSeatsNumber(int number) {
        this.seats = number;
    }

    @Override
    public void setProportions(List proportions) {
        this.proportions = proportions;
    }
    public Plane getPlane(){
        return new Plane(type,engine,seats,proportions);
    };
}
