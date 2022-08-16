package com.example.extra;
//import com.example.extra.Statement;
public class Catalog {
    Statement[] statements ;
    int currentIndex = 0;
    int size = 0;
    public Catalog(String[] text, boolean[] correct){
        this.statements = new Statement[text.length];
        this.size = text.length;
        System.out.println("size of the array: " + size);
        for (int i=0;i<text.length;i++){
            System.out.println(text[i] +" " + correct.toString());
            this.statements[i] = new Statement(text[i],correct[i]);
        }

    }

    public Statement getCurrentStatement(){
        return this.statements[this.currentIndex];
    }

    public void jumpToNextStatement(){
        if (this.currentIndex<this.statements.length-1){
            this.currentIndex++;
        }
        else {
            this.currentIndex = 0;
        }
    }

    public int getSize(){
        return this.size;
    }

    public int getCurrentIndex(){
        return currentIndex;
    }
}
