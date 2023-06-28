package com.designPatterns.memento;

public class State {
    private String content;

    public State(String s) {
        content = s;
    }
    public void setContent(String s) {
        content = s;
    }
    public String getContent(){
        return content;
    }
    
}
