package com.designPatterns.adapter;

import com.designPatterns.adapter.XmlData;
import com.designPatterns.adapter.zomatoDashboard;

public class Main {

    public static void main(String[] args) {
        IDashboard  zoma = new zomatoDashboard();
        XmlData xd = new XmlData("<?xml version=\"1.0\" ?><test attrib=\"Israeli\">Platter</test><test attrib=\"Chinese\">Schezwan</test>");
        zoma.displayFoodMenu(xd);


        IDashboard tpa = new thirdpartyAdapter();
        tpa.displayFoodMenu(xd);
    }

}
