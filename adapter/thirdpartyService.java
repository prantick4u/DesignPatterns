package com.designPatterns.adapter;

import com.designPatterns.adapter.JsonData;

public class thirdpartyService {

    public void displayFoodMenu(JsonData d){
        System.out.println("thirdparty service displays menu \n"+ d.getData());
    }

    public void displayRecommendations(JsonData d){
        System.out.println("thirdparty service displays Recommendations\n" + d.getData());
    }
}
