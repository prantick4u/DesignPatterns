package com.designPatterns.adapter;

public class JsonData {
    private String jsonString;
    public JsonData(String s) {
        jsonString = s;
    }
    public String getData(){ return jsonString;}
}
