package com.designPatterns.memento;

import java.util.ArrayList;
import java.util.List;
import com.designPatterns.memento.State;

public class History {
    public List<State> states = new ArrayList<>();

    public void add(State s){
        states.add(s);
    }
    public State pop(){
        State last = states.get(states.size()-1);
        states.remove(last);
        return last;
    }
}
