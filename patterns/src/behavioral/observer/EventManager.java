package behavioral.observer;

import behavioral.observer.model.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String ... types){
        for(String k : types){
            listeners.put(k, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener eventListener){
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.add(eventListener);
    }

    public void unsubscribe(String eventType, EventListener eventListener){
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.remove(eventListener);
    }

    public void notify(String eventType, User user){
        List<EventListener> eventListeners = listeners.get(eventType);

        for(EventListener el : eventListeners){
            el.update(user);
        }
    }
}
