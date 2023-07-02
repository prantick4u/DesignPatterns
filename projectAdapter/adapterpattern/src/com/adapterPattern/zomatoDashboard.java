package com.adapterPattern;


import com.designPatterns.projectPattern.adapterPattern.IDashboard;

public class zomatoDashboard implements IDashboard {
    @Override
    public void displayFoodMenu(XmlData d){
        System.out.println("zomato service displays menu\n" + d.getData());

    }
    @Override
    public void displayRecommendations(XmlData d){
        System.out.println("zomato service displays Recommendations\n" + d.getData());
    }
    
}
