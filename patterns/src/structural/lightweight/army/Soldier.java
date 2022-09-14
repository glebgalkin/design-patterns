package structural.lightweight.army;

public class Soldier implements ArmyMan {

    private Type type;

    public Soldier(Type type){
        this.type = type;
    }

    @Override
     public void attack(){
        System.out.println("I am " + type + ", I attack!");
    }
}
