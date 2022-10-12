package behavioral.observer.listeners;

import behavioral.observer.EventListener;
import behavioral.observer.model.User;

public class EmailService implements EventListener {

    @Override
    public void update(User user) {
        System.out.println("A user with id " +  user.getId() + " and with email " + user.getEmail() + " is added to system. Sending a welcoming email...");
    }
}
