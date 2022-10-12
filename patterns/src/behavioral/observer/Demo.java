package behavioral.observer;

import behavioral.observer.listeners.DatabaseService;
import behavioral.observer.listeners.EmailService;
import behavioral.observer.model.User;

public class Demo {
    public static void main(String[] args) {

        EventManager eventManager = new EventManager("newUserAdded");

        DatabaseService dbs = new DatabaseService();
        eventManager.subscribe("newUserAdded", dbs);

        EmailService es = new EmailService();
        eventManager.subscribe("newUserAdded", es);

        User u1 = new User(1, "Anthony", "anthony12@gmail.com");
        eventManager.notify("newUserAdded", u1);

        eventManager.unsubscribe("newUserAdded", dbs);

        User u2 = new User(2, "Alex", "alex47@gmail.com");
        eventManager.notify("newUserAdded", u2);
    }
}
