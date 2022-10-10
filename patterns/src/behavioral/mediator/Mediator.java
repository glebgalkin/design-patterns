package behavioral.mediator;

import behavioral.mediator.employee.Employee;

public interface Mediator {

    void registerEmployee(Employee employee);

    void meetGuest();
    void takeOrder(String order);
    void cookMeal();
    void calculateCheck();
}
