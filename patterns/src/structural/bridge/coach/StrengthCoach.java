package structural.bridge.coach;

import structural.bridge.athlete.Athlete;
import structural.bridge.coach.Coach;

public class StrengthCoach implements Coach {

    private Athlete athlete;

    public StrengthCoach(Athlete athlete){
        this.athlete = athlete;
    }

    @Override
    public void train() {
        athlete.setStrength(athlete.getStrength()+1);
        System.out.println("Athlete's strength: " + athlete.getStrength() + " " + "Class: " + athlete.getClass());
        athlete.train();
    }
}
