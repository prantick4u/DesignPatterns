package com.adapterPattern;




/*  this defines how any dashboard APIs
*   are to be implemented.
*/
public interface IDashboard {
    void displayFoodMenu(XmlData d);
    void displayRecommendations(XmlData d);
}
