package behavioral.mediator.employee;

import behavioral.mediator.Mediator;
import behavioral.mediator.employee.Employee;

public class Waiter implements Employee {

    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getJobTitle() {
        return "Waiter";
    }

    public void takeOrder(String order){
        System.out.println("Order taken: " + order);
    }
}
