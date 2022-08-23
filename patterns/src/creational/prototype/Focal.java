package creational.prototype;

public class Focal extends Speaker{

   private String modeName;
   private int price;

   public Focal(String modeName, int price){
       this.modeName = modeName;
       this.price = price;
   };

   public Focal(Focal focal){
       this.modeName = focal.getModeName();
       this.price = focal.getPrice();
   }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public Speaker clone() {
        return new Focal(this);
    }

    @Override
    public boolean equals(Object o){
       if(this == o){return true;}
       if(getClass() !=o.getClass()){return false;}
       Focal focal = (Focal) o;
       return this.getModeName().equals(focal.getModeName())&& this.getPrice()== focal.getPrice();
    }
}