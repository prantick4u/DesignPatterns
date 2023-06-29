
package com.designPatterns.memento;

import com.designPatterns.memento.Editor;

import com.designPatterns.memento.History;


public class Main{
    public static void main(String[] args){

        /*****************************************
         * 
         * Here the idea is the Editor(originator) will
         * be editing the and change the states & if it 
         * require to go back(undo) to the previous 
         * state, then History(Caretaker) class will maintain the 
         * State(Memento) class objects which will be restored 
         * to the Editor.
         * 
         ****************************************/
        System.out.println("This is Memento\n");
        Editor editor = new Editor("first state");
        History hist = new History();

        hist.add(editor.createState());
        System.out.println(editor.getContent());
        
        editor.modifyContent("Second state");
        hist.add(editor.createState());

        editor.modifyContent("Third state");

        editor.restoreState(hist.pop());
        System.out.println("restore 1: " + editor.getContent());

        editor.restoreState(hist.pop());
        System.out.println("restore 2:" + editor.getContent());
    }
}