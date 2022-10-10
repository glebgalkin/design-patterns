package behavioral.mediator.employee;

import behavioral.mediator.Mediator;
import behavioral.mediator.employee.Employee;

public class Chief implements Employee {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getJobTitle() {
        return "Chief";
    }

    public void cookTheMeal(){
        System.out.print("Cooking that food!");
    }
}
