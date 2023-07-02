package com.designPatterns.adapter;


public class XmlData {
    private String xmlString;
    public XmlData(String s) {
        xmlString = s;
    }
    public String getData(){ return xmlString;}
}
