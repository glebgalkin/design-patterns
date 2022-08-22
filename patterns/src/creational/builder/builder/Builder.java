package creational.builder.builder;

import creational.builder.model.PlaneType;
import creational.builder.model.components.Engine;

import java.util.List;

public interface Builder {

    void type(PlaneType type);
    void setEngine(Engine engine);
    void setSeatsNumber(int number);
    void setProportions(List proportions);
}
