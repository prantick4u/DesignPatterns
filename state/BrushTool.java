package com.designPatterns.state;

public class BrushTool implements Tool{
    @Override
    public void mouseDown(){
        System.out.println("Brush tool selected");
    }

    @Override
    public void mouseUp(){
        System.out.println("Brush draw a line");
    }
}
