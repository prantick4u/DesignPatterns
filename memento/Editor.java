package com.designPatterns.memento;

import com.designPatterns.memento.State;

public class Editor {
    String cntnt;
    public Editor(String s) { cntnt = s;}
    public String getContent(){return cntnt;}

    public void modifyContent(String s){
        cntnt = s;
    }
    public State createState(){
        return new State(cntnt);
    }
    public void restoreState(State s){
        cntnt = s.getContent();
    }
}
