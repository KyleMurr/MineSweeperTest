package org.example.Models;

public abstract class Tiles {
    int pos = 0;
    static private int totalObs = 0;
    static private int totalnums = 0;

    static private int FlagOnBomb = 0;
    public Tiles(){

    }

    public static int getTotalObs() {
        return totalObs;
    }

    public static void setTotalNums() {
        totalObs++;
    }

    public static void removeOBJ(){
        totalObs --;
    }

    public static int getTotalnums() {
        return totalnums;
    }

    public static void IncrementFlagOnBomb() {
        Tiles.totalnums++;
    }

    public static int getFlagOnBomb() {
        return FlagOnBomb;
    }

    public static void setFlagOnBomb() {
        Tiles.FlagOnBomb ++;
    }

    abstract boolean Hit();

    @Override
    public String toString() {
        return "";
    }
}


