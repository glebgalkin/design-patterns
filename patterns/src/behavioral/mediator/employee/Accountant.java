package behavioral.mediator.employee;

import behavioral.mediator.Mediator;
import behavioral.mediator.employee.Employee;

public class Accountant implements Employee {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getJobTitle() {
        return "Accountant";
    }

    public void calculateCheck(){
        System.out.print("Total: " + "15$");
    }
}
