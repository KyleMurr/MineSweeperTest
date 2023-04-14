package org.example.Models;

public abstract class OBJ {
    int pos = 0;
    static private int totalObs = 0;
    static private int totalbobms = 0;
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

    public static int getTotalbobms() {
        return totalbobms;
    }

    public static void setTotalbobms() {
        OBJ.totalbobms ++;
    }

    abstract boolean Hit();

    @Override
    public String toString() {
        return "";
    }
}


