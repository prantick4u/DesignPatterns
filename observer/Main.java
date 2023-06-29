package com.designPatterns.observer;

import com.designPatterns.observer.EmailListner;
import com.designPatterns.observer.MobileListner;
import com.designPatterns.observer.NotificationService;

public class Main {
    public static void main(String[] args) {
        NotificationService ns = new NotificationService();
        
        ns.subscribe(new EmailListner("Mark Mason"));
        ns.subscribe(new EmailListner("Joey Barnes"));
        ns.subscribe(new MobileListner("Rachel Weisz"));

        ns.notifyFollowers();

    }
}
