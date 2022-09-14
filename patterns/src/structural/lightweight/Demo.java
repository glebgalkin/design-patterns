package structural.lightweight;

import structural.lightweight.army.Soldier;
import structural.lightweight.army.SoldierFactory;
import structural.lightweight.army.Type;

import java.util.Random;

import static structural.lightweight.army.Type.*;

public class Demo {

    public static void main(String[] args) {

        Type[] types = {Captain, Mayor, Troop};

        Random ran = new Random();

        SoldierFactory soldierFactory = new SoldierFactory();

        for(int k = 0; k<20; k++){
            int x = ran.nextInt(3);
            Soldier soldier = soldierFactory.getSoldier(types[x]);
            soldier.attack();
        }


    }
}
