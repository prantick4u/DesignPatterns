package com.designPatterns.state;

public class EraseTool implements Tool{
    @Override
    public void mouseDown(){
        System.out.println("EraseTool selected");
    }

    @Override
    public void mouseUp(){
        System.out.println("Erased something");
    }
}
