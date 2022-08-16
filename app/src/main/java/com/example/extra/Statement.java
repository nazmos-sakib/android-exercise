package com.example.extra;
public class Statement {

    String text;
    boolean correct;

    public Statement(){

    }
    public Statement(String text, boolean correct){
        this.text = text;
        this.correct = correct;
    }

    public boolean isCorrect(){
        return this.correct;
    }
    public String getText(){
        return  this.text;
    }
}
