package org.example.Models;

public class numbers extends Tiles {
    int bombsHitting = 0;
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


    public Boolean NextToBomb(int Row, int Column){
        //Checks If there is a bomb above or below
        if(p2 == Column + 1 && Row == p1){
            bombsHitting++;
            return true;
        }

        if(p2 == Column - 1 && Row == p1){
            bombsHitting++;
            return true;
        }

        //Checks if a bomb is to either side
        if(Column == p2 && Row == p1 -1 ){
            bombsHitting++;
            return true;
        }

        if(Column == p2 && Row == p1 +1 ){
            bombsHitting++;
            return true;
        }

        //Check if a bomb is diagonal
        if(p2 + 1 == Column ){

            if(p1 + 1 == Row ){
                bombsHitting++;
                return true;
            }

            if(p1 - 1 == Row ){
                bombsHitting++;
                return true;
            }

        }

        if(p2 - 1 == Column ){

            if(p1 + 1 == Row ){
                bombsHitting++;
                return true;
            }

            if(p1 - 1 == Row ){
                bombsHitting++;
                return true;
            }

        }
        return false;
    }


    @Override
    public String toString() {
        return String.valueOf(bombsHitting);
    }
}
