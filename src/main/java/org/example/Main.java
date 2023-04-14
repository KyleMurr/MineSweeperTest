package org.example;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import org.example.Models.*;

public class Main {
    public static void main(String[] args) {
//        int[] nums = new int[]{1,2,3,4,5};
//
//        char[] chars1 = new char[]{'1','2','3','4','5','6','7','8','9'};
//        int i = 0;
//        var board = setDisplayBoard();
//
//        var board1  = setBoard();
//        printBoard(board,chars1,i,nums);
//
//        RunGame(nums, chars1, i, board, board1);

        Game game = new Game();

        var board = game.gameBoard;

        board.setBoard();
    }

    public static void RunGame(int[] nums, char[] chars1, int i, char[][] board, Tiles[][] board1) {
//        while(true) {
//            String[] SplitInput = new String[0];
//            try {
//                Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//                System.out.println("What is your selection: ");
//
//                String Selection = myObj.nextLine();  // Read user input
//                SplitInput = Selection.split("");
//
//                if (Tiiles.getTotalObs() == 0) {
//                    System.out.println("You Have won!!!!");
//                } else if (CheckInput(Integer.parseInt(SplitInput[0]) -1, Integer.parseInt(SplitInput[1]) -1 , board1 ,board)) {
//                    System.out.println("Please Pick Another suggestion");
//                    continue;
//                }
//
//                if (board1[Integer.parseInt(SplitInput[0]) - 1][Integer.parseInt(SplitInput[1]) - 1] instanceof bomb) {
//                    board[Integer.parseInt(SplitInput[0]) - 1][Integer.parseInt(SplitInput[1]) - 1] = 'X';
//                    printBoard(board, chars1, i, nums);
//                    System.out.println("Game Over");
//                    break;
//                } else {
//                    board[Integer.parseInt(SplitInput[0]) - 1][Integer.parseInt(SplitInput[1]) - 1] = '+';
//                    printBoard(board, chars1, i, nums);
//                    Tiiles.removeOBJ();
//                }
//            } catch (Exception e) {
//                System.out.println("The Combo of: " + SplitInput[0] + " Does not exist try again" );
//            }
//        }
    }

//    public static Boolean CheckInput(Integer Input1, Integer Input2, Tiiles[][] board1, char[][] board){
//
//        if(board[Input1][Input2] == '+'){
//            return true;
//        }else{
//            return false;
//        }
//
//
//    }

//    public static char[][] setDisplayBoard(){
//        char board[][] = new char[9][5];
//        for (int i = 0; i < 9; i++) {
//            Arrays.fill(board[i], '?');
//        }
//        return board;
//    }

//


}
