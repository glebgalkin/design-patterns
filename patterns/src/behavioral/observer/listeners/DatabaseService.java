package behavioral.observer.listeners;

import behavioral.observer.EventListener;
import behavioral.observer.model.User;

public class DatabaseService implements EventListener {

    @Override
    public void update(User user) {
        System.out.println("A new user " + user.getName() + " was added to a database");
    }
}
