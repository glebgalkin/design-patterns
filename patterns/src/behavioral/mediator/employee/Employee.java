package behavioral.mediator.employee;

import behavioral.mediator.Mediator;

public interface Employee {
    void setMediator(Mediator mediator);
    String getJobTitle();
}
