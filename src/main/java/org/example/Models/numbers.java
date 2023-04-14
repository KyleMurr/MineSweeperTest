package org.example.Models;

public class numbers extends Tiles {
    int bombsHitting;
    int p1 = 0;
    int p2 = 0;

    numbers(int p1, int p2){
       this.p1 = p1;
       this.p2 = p2;

    }

    @Override
    boolean Hit() {
        return false;
    }


    public void NextToBomb(int bombp1, int bombp2){
        if(bombp1 - p1  == 1 && bombp2 == p2){
            bombsHitting++;
        }
//        else if(bombp2 - p2 == 1){
//            bombsHitting++;
//        }
    }


    @Override
    public String toString() {
        return String.valueOf(bombsHitting);
    }
}
