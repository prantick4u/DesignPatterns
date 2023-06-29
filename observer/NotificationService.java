package com.designPatterns.observer;
import com.designPatterns.observer.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private List<Subscriber> followers = new ArrayList<>();

    public void subscribe(Subscriber s){
        followers.add(s);
    }
    public void unsubscribe(Subscriber s){
        followers.remove(s);
    }
    public void notifyFollowers() {
        for (Subscriber subscriber : followers) {
            subscriber.update();
        }
    }
}
