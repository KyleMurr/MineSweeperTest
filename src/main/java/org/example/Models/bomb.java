package org.example.Models;

public class bomb extends Tiles {

    public int p1 = 0;
    public int p2 = 0;

   public bomb(int p1,int p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public bomb() {

    }

    @Override
    boolean Hit() {
        return true;
    }

    @Override
    public String toString() {
        return "b";
    }
}
