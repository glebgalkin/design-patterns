package creational.builder.model;

import creational.builder.model.components.Engine;

import java.util.List;

public class Plane {
    private PlaneType type;
    private Engine engine;
    private int seats;
    private List proportions;

    public Plane(PlaneType type, Engine engine, int seats, List proportions) {
        this.type = type;
        this.engine = engine;
        this.seats = seats;
        this.proportions = proportions;
    }

    public void setType(PlaneType type) {
        this.type = type;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setProportions(List proportions) {
        this.proportions = proportions;
    }
}
