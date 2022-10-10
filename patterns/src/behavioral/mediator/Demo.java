package behavioral.mediator;

import behavioral.mediator.employee.Accountant;
import behavioral.mediator.employee.Chief;
import behavioral.mediator.employee.FrontDesk;
import behavioral.mediator.employee.Waiter;

public class Demo {

    public static void main(String[] args) {
        RestaurantManager restaurantManager = new RestaurantManager();
        restaurantManager.registerEmployee(new FrontDesk());
        restaurantManager.registerEmployee(new Waiter());
        restaurantManager.registerEmployee(new Chief());
        restaurantManager.registerEmployee(new Accountant());

        restaurantManager.meetGuest();
        restaurantManager.takeOrder("burger");
        restaurantManager.cookMeal();
        restaurantManager.calculateCheck();

    }
}
