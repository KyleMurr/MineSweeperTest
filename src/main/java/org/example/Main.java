package org.example;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import org.example.Models.*;
import javax.swing.*;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};

        char[] chars1 = new char[]{'1','2','3','4','5','6','7','8','9'};
        int i = 0;
        var board = setDisplayBoard();

        var board1  = setBoard();
        printBoard(board,chars1,i,nums);

        while(true) {
            String[] SplitInput = new String[0];
            try {
                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
                System.out.println("What is your selection: ");

                String Selection = myObj.nextLine();  // Read user input
                SplitInput = Selection.split("");

                if (OBJ.getTotalObs() == 0) {
                    System.out.println("You Have won!!!!");
                } else if (board[Integer.parseInt(SplitInput[0]) - 1][Integer.parseInt(SplitInput[1]) - 1] == '+') {
                    System.out.println("Please Pick Another suggestion");
                    continue;
                }

                if (board1[Integer.parseInt(SplitInput[0]) - 1][Integer.parseInt(SplitInput[1]) - 1] instanceof bomb) {
                    board[Integer.parseInt(SplitInput[0]) - 1][Integer.parseInt(SplitInput[1]) - 1] = 'X';
                    printBoard(board, chars1, i, nums);
                    System.out.println("Game Over");
                    break;
                } else {
                    board[Integer.parseInt(SplitInput[0]) - 1][Integer.parseInt(SplitInput[1]) - 1] = '+';
                    printBoard(board, chars1, i, nums);
                    OBJ.removeOBJ();
                }
            } catch (Exception e) {
                System.out.println("The Combo of: " + SplitInput[0] + " Does not exist try again" );
            }


        }
    }

    public static char[][] setDisplayBoard(){
        char board[][] = new char[9][5];
        for (int i = 0; i < 9; i++) {
            Arrays.fill(board[i], '?');
        }
        return board;
    }

    public static OBJ[][] setBoard() {
        Random rand = new Random();

        OBJ[][] board = new OBJ[9][5];
        char[] chars1 = new char[]{'A', 'B', 'C', 'D'};
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 5; j++) {
                int r = rand.nextInt(10);
                if (r % 3 == 0) {
                    board[i][j] = new bomb();
                    OBJ.setTotalbobms();
                } else {
                    board[i][j] = new numbers();
                    OBJ.setTotalObs();
                }
            }
        }
        System.out.println(OBJ.getTotalbobms());
        return board;
    }

    public  static void printBoard(char[][] board,char[] nums1,int i,int[] nums){
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
            System.out.println("");
            i++;
        }
    }
}
