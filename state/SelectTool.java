package com.designPatterns.state;

public class SelectTool implements Tool{
    @Override
    public void mouseDown(){
        System.out.println("SelectTool  selected");
    }

    @Override
    public void mouseUp(){
        System.out.println("d=Draw a rectangle");
    }
}
