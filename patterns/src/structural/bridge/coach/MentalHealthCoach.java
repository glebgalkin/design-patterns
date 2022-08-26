package structural.bridge.coach;

import structural.bridge.athlete.Athlete;
import structural.bridge.coach.Coach;

public class MentalHealthCoach implements Coach {

    private Athlete athlete;

    public MentalHealthCoach(Athlete athlete){
        this.athlete = athlete;
    }

    @Override
    public void train() {
        athlete.setConfidence(athlete.getConfidence()+1);
        System.out.println("Athlete's mental state: " + athlete.getStrength() + " " + "Class: " + athlete.getClass());
    }
}
