package org.example.Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Board {

    int Size = 0;

    public Tiles[][] Grid_ItemPos;
    public char[][] DisplayBoard;
    public ArrayList<bomb> bombsPos;
    public ArrayList<numbers> Nums;

    public int Columns = 0;
    public int rows = 0;

    public Board() {
        Grid_ItemPos = setBoard();
        DisplayBoard = setDisplayBoard();
    }

    public Tiles[][] setBoard() {
        Random rand = new Random();
        bombsPos = new ArrayList<>();
        Nums = new ArrayList<>();
        Columns = 5;
        Tiles[][] board = new Tiles[9][5];
        for (int i = 0; i < 9; i++) {
            rows++;
            for (int j = 0; j < 5; j++) {
                int r = rand.nextInt(20);
                if (i + j == 1) {
                    var newB = new bomb(i, j);
                    board[i][j] = newB;
                    bombsPos.add(newB);
                    System.out.println(i + " " + j);
                    Tiles.IncrementFlagOnBomb();
                } else {
                    var newN = new numbers(i, j);
                    System.out.println(i + " NUM " + j);
                    board[i][j] = newN;
                    Nums.add(newN);
                    Tiles.setTotalNums();
                }
            }
        }
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int i = 0;
        System.out.print(" ");
        System.out.print("");
        for (var n : nums) {
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();

        for (var bomb : bombsPos
        ) {
            for (var n : Nums
            ) {
                n.NextToBomb(bomb.p1, bomb.p2);
            }
        }


        for (var l : board
        ) {
            for (var m : l
            ) {
                System.out.print("|");
                System.out.print(m);
            }
            System.out.print("|");
            System.out.println();
        }


        for (var x:Nums
             ) {
            System.out.println(x.bombsHitting);
        }

        return board;
    }


    public char[][] setDisplayBoard() {
        char board[][] = new char[9][5];
        for (int i = 0; i < 9; i++) {
            Arrays.fill(board[i], '?');
        }
        return board;
    }

    public void printBoard(char[][] board) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        int i = 0;
        char[] chars1 = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'};

        System.out.print(" ");
        System.out.print(" ");
        for (var n : nums) {
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
        for (var m : board) {
            System.out.print(chars1[i]);
            for (var l : m) {
                System.out.print("|");
                System.out.print(l);
            }
            System.out.print("|");
            System.out.println();
            i++;
        }
    }

}
