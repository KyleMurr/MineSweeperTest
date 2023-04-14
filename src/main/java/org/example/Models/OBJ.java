package org.example.Models;

public abstract class OBJ {
    int pos = 0;
    static private int totalObs = 0;

    public OBJ(){

    }

    public static int getTotalObs() {
        return totalObs;
    }

    public static void setTotalObs() {
        totalObs++;
    }



    public static void removeOBJ(){
        totalObs --;
    }

    abstract boolean Hit();

    @Override
    public String toString() {
        return "";
    }
}


