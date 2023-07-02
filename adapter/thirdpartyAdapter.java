package com.designPatterns.adapter;

import com.designPatterns.adapter.IDashboard;

import com.designPatterns.adapter.JsonData;

import com.designPatterns.adapter.thirdpartyService;



import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.json.simple.XML;

public class thirdpartyAdapter implements IDashboard{
    private final thirdpartyService tp;
    
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;
    thirdpartyAdapter(){
        tp =  new thirdpartyService();
    }
    @Override
    public void displayFoodMenu(XmlData d){
        System.out.println("thirdparty adapter displays menu");
        tp.displayFoodMenu(convertToJson(d));
    }

    @Override
    public void displayRecommendations(XmlData d){
        System.out.println("thirdparty adapter displays Recommendations");
        tp.displayRecommendations(convertToJson(d));
    }
    
    private JsonData convertToJson(XmlData d){

        
        String jsonPrettyPrintString;
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(d.getData());
            jsonPrettyPrintString = xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);
            
        } catch (JSONException je) {
            System.out.println(je.toString());
        }
        
        return new JsonData(d.getData());
    }
}
