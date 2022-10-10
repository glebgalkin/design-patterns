package behavioral.mediator;

import behavioral.mediator.employee.*;

public class RestaurantManager implements Mediator{

    private FrontDesk frontDesk;
    private Waiter waiter;
    private Chief chief;
    private Accountant accountant;

    @Override
    public void registerEmployee(Employee employee){
        switch (employee.getJobTitle()) {
            case "Front desk" -> this.frontDesk = (FrontDesk) employee;
            case "Waiter" -> this.waiter = (Waiter) employee;
            case "Chief" -> this.chief = (Chief) employee;
            case "Accountant" -> this.accountant = (Accountant) employee;
        }
    }

    @Override
    public void meetGuest() {
        frontDesk.greedTheGuest();
        frontDesk.findTheSeat();
    }

    @Override
    public void takeOrder(String order) {
        waiter.takeOrder(order);
    }

    @Override
    public void cookMeal() {
        chief.cookTheMeal();
    }

    @Override
    public void calculateCheck() {
        accountant.calculateCheck();
    }


}
