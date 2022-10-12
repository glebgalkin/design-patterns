package behavioral.observer;

import behavioral.observer.model.User;

public interface EventListener {

    void update(User user);
}
