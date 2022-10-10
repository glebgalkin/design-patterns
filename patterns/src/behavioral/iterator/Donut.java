package behavioral.iterator;

public class Donut extends Food{

    private int diameter;
    private String brandName;

    public Donut(int diameter, String brandName) {
        this.diameter = diameter;
        this.brandName = brandName;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
