package structural.lightweight.army;

import java.util.HashMap;

public class SoldierFactory {

    HashMap<Type, Soldier> hashMap = new HashMap<>();

    public Soldier getSoldier(Type type){
        Soldier soldier = hashMap.get(type);

        if(soldier == null){
            soldier = new Soldier(type);
            hashMap.put(type, soldier);
            System.out.println("Created a new soldier");
        }

        return soldier;
    }


}
