
package com.designPatterns.state;
import com.designPatterns.state.Tool;

public class Canvas {
    private Tool currentTool;

    public Tool getTool() { return currentTool;}
    public void setTool(Tool t) { currentTool = t;}
    

    public void mouseUp(){
        currentTool.mouseUp();
    }
    public void mouseDown(){
        currentTool.mouseDown();
    }
    
}
