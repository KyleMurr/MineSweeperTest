package org.example.Models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Board {

    int Size = 0;

    Tiles[][] Grid_ItemPos;
    char[][] DisplayBoard;

    public Board(){
        Grid_ItemPos = setBoard();
        DisplayBoard = setDisplayBoard();
    }

    public Tiles[][] setBoard() {
        Random rand = new Random();
        ArrayList<bomb> bombsPos = new ArrayList<>();
        ArrayList<numbers> Nums = new ArrayList<>();

        Tiles[][] board = new Tiles[9][5];
        char[] chars1 = new char[]{'A', 'B', 'C', 'D'};
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                int r = rand.nextInt(20);
                if (r % 5 == 0) {
                    var newB = new bomb(i,j);
                    board[i][j] = newB;
                    bombsPos.add(newB);

                    Tiles.setTotalbobms();
                } else {
                    var newN = new numbers(i,j);
                    board[i][j] = newN;
                    Nums.add(newN);
                    Tiles.setTotalObs();
                }
            }
        }
        int[] nums = new int[]{1,2,3,4,5};
        int i = 0;
        System.out.print(" ");
        System.out.print("");
        for (var n:nums) {
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println();

        for (var bomb:bombsPos
        ) {
            for (var n: Nums
            ) {
                n.NextToBomb(bomb.p1,bomb.p2);
            }
        }

        for (var l:board
             ) {
            for (var m : l
                 ) {
                System.out.print("|");
                System.out.print(m);
            }
            System.out.print("|");
            System.out.println();
        }

        //Check if bomb hitting num


//        System.out.println(Tiles.getTotalbobms());
        return board;
    }


    public char[][] setDisplayBoard(){
        char board[][] = new char[9][5];
        for (int i = 0; i < 9; i++) {
            Arrays.fill(board[i], '?');
        }
        return board;
    }

    public  void printBoard(char[][] board,char[] nums1){
        int[] nums = new int[]{1,2,3,4,5};
        int i = 0;
        char[] chars1 = new char[]{'1','2','3','4','5','6','7','8','9'};

        System.out.print(" ");
        System.out.print(" ");
        for (var n:nums) {
            System.out.print(n);
            System.out.print(" ");
        }
        System.out.println("");
        for (var m: board) {
            System.out.print(nums1[i]);
            for (var l: m) {
                System.out.print("|");
                System.out.print(l);
            }
            System.out.print("|");
            System.out.println();
            i++;
        }
    }

}
