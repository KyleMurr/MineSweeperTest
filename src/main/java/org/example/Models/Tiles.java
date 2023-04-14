package org.example.Models;

public abstract class Tiles {
    int pos = 0;
    static private int totalObs = 0;
    static private int totalbobms = 0;
    public Tiles(){

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
        Tiles.totalbobms ++;
    }

    abstract boolean Hit();

    @Override
    public String toString() {
        return "";
    }
}


