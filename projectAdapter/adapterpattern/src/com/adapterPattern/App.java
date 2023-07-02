package com.adapterPattern;
import com.adapterPattern.XmlData;
import com.adapterPattern.IDashboard;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        IDashboard  zoma = new zomatoDashboard();
        XmlData xd = new XmlData("<?xml version=\"1.0\" ?><test attrib=\"Israeli\">Platter</test><test attrib=\"Chinese\">Schezwan</test>");
        zoma.displayFoodMenu(xd);


        IDashboard tpa = new thirdpartyAdapter();
        tpa.displayFoodMenu(xd);
        
    }
}
