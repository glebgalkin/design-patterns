package behavioral.mediator.employee;

import behavioral.mediator.Mediator;
import behavioral.mediator.employee.Employee;

public class FrontDesk implements Employee {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getJobTitle() {
        return "Front desk";
    }

    public void greedTheGuest(){
        System.out.println("Welcome dear guest!");
    }

    public void findTheSeat(){
        System.out.println("Finding seat for you!");
    }
}
