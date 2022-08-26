package structural.bridge.athlete;

import structural.bridge.athlete.Athlete;

public class SoccerPlayer implements Athlete {

    private int confidence;
    private int strength;

    @Override
    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }

    @Override
    public int getConfidence() {
        return confidence;
    }

    @Override
    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public int getStrength() {
        return strength;
    }

    @Override
    public void train() {
        System.out.println("I am a soccer player I am training.");
    }
}
