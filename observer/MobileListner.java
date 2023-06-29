package com.designPatterns.observer;

import com.designPatterns.observer.Subscriber;

public class MobileListner implements Subscriber {
    private final String userName;
    public MobileListner(String s){
        userName = s;
    }
    @Override
    public void update(){
        System.out.println("Mobile Notification "  + userName);
    }
}
