package com.designPatterns.state;

import com.designPatterns.state.BrushTool;
import com.designPatterns.state.Canvas;
import com.designPatterns.state.EraseTool;
import com.designPatterns.state.SelectTool;
import com.designPatterns.state.Tool;

public class Main {
    public static void main(String[] args) {
        /******************************************************
         * Here whenever we are passing the Tool object based on 
         * the tool type respective tool's interface will be 
         * called.
         * 
         * Open-Close feature: classes are open for extension 
         * but closed for modification.
         *
         * In future if some new tools are to be introduced 
         * it just needs to be 'implements' the Tool class.
         *******************************************************/
        Canvas cv = new Canvas();
        cv.setTool(new BrushTool());
        cv.mouseUp();
        cv.mouseDown();

        cv.setTool(new SelectTool());
        cv.mouseUp();
        cv.mouseDown();
        
        cv.setTool(new EraseTool());
        cv.mouseUp();
        cv.mouseDown();
    }
}
