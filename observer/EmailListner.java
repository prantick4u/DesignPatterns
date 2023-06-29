package com.designPatterns.observer;
import com.designPatterns.observer.Subscriber;

public class EmailListner implements Subscriber {
    private final String userName;
    public EmailListner(String s){
        userName = s;
    }
    @Override
    public void update(){
        System.out.println("Email Notification "  + userName);
    }
}
