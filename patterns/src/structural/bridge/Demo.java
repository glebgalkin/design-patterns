package structural.bridge;

import structural.bridge.athlete.Athlete;
import structural.bridge.athlete.HockeyPlayer;
import structural.bridge.athlete.SoccerPlayer;
import structural.bridge.coach.MentalHealthCoach;
import structural.bridge.coach.StrengthCoach;

public class Demo {

    public static void main(String[] args) {
            testAthlete(new HockeyPlayer());
            testAthlete(new SoccerPlayer());
    }

    public static void testAthlete(Athlete athlete){
        StrengthCoach strengthCoach = new StrengthCoach(athlete);
        MentalHealthCoach mentalHealthCoach = new MentalHealthCoach(athlete);
        strengthCoach.train();
        mentalHealthCoach.train();
    }
}
