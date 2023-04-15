package org.example.Models;

import java.util.Objects;
import java.util.Scanner;

public class Game {

    public Board gameBoard;

    public Game() {
        gameBoard = new Board();
    }


    public void Play() {
        while (true) {
            Scanner MoveType = new Scanner(System.in);
            System.out.println("What is your move type: 1 for expose, 2 for flag: ");

            String r = MoveType.nextLine();


            Scanner Position = new Scanner(System.in);
            System.out.println("Input the position ");
            String s = Position.nextLine();
            var splitIntput = s.split("");

            Boolean flag = r.equals("2");

            checkInput(Integer.parseInt(splitIntput[0]) - 1, Integer.parseInt(splitIntput[1]) - 1, flag);
        }
    }

    public void ExposeNearBlanks(int p1, int p2) {
        //if Top,Bottom,Left,Right around the blank is blank Reveal those tiles.
        numbers charr = (numbers) gameBoard.Grid_ItemPos[p1][p2];
        On Current = null;
        gameBoard.DisplayBoard[p1][p2] = '0';
        if (p2 - 1 >= 0) {
            if (gameBoard.DisplayBoard[p1][p2 - 1] != '0') {
                numbers topChar = (numbers) gameBoard.Grid_ItemPos[p1][p2 - 1];
                if (topChar.bombsHitting == 0) ExposeNearBlanks(p1, p2 - 1);
            }
        }

        if (p2 + 1 < gameBoard.Columns) {
            if (gameBoard.DisplayBoard[p1][p2 + 1] != '0') {
                numbers BottomChar = (numbers) gameBoard.Grid_ItemPos[p1][p2 + 1];
                if (BottomChar.bombsHitting == 0) ExposeNearBlanks(p1, p2 + 1);
            }
        }

        if (p1 - 1 >= 0) {
            if (gameBoard.DisplayBoard[p1 -1][p2] != '0') {
                numbers LeftChar = (numbers) gameBoard.Grid_ItemPos[p1 - 1][p2];
                if (LeftChar.bombsHitting == 0) ExposeNearBlanks(p1 - 1, p2);
            }
        }
//
        if ( p1 + 1 < gameBoard.rows) {
            if (gameBoard.DisplayBoard[p1 +1][p2] != '0') {
            numbers RightChar = (numbers) gameBoard.Grid_ItemPos[p1 + 1][p2];
            if(RightChar.bombsHitting == 0) ExposeNearBlanks(p1 + 1, p2 );
            }
        }

//        var ColumnP = p2;
//        var rowP = p1;
////        for (var n:gameBoard.Nums
////             ) {
////            if (ColumnP +1 == n.p2 && rowP == n.p1 ) {
////            numbers currentChar = (numbers) gameBoard.Grid_ItemPos[p1][p2 + 1];
////            if(currentChar.bombsHitting == 0){
////                gameBoard.DisplayBoard[p1][ColumnP] = '0';
////            }
////            ColumnP = n.p2;
////
////        }
////        }
//        numbers currentChar = (numbers) gameBoard.Grid_ItemPos[p1][p2 + 1];
//        while(currentChar.bombsHitting == '0'){
//
//        }
//        gameBoard.printBoard(gameBoard.DisplayBoard);


    }


    public void checkInput(int p1, int p2, Boolean Flag) {
        var l = gameBoard.Grid_ItemPos;
        var displayGrid = gameBoard.DisplayBoard;


        if (displayGrid[p1][p2] != '?' && Flag) {
            Scanner i = new Scanner(System.in);
            System.out.println("Do you want to remove this flag ?: Y,N");
            var Remove = i.nextLine();

            displayGrid[p1][p2] = Objects.equals(Remove, "Y") ? '?' : '!';
        } else if (displayGrid[p1][p2] == '?' && Flag) {
            gameBoard.DisplayBoard[p1][p2] = '!';
            if (l[p1][p2] instanceof bomb) {
                Tiles.setFlagOnBomb();
            }

        } else if (displayGrid[p1][p2] != '?' && !Flag) {
            System.out.println("This Tile has been Revealed or is a flag, Try another Co-ord");
        } else if (l[p1][p2] instanceof bomb && !Flag) {
            System.out.println("GameOver!!!");
            System.exit(0);
        } else {
            numbers n = (numbers) l[p1][p2];
            if (n.bombsHitting != 0) {
                Tiles.removeOBJ();
                var c = l[p1][p2];
                displayGrid[p1][p2] = c.toString().charAt(0);

            } else {
                ExposeNearBlanks(p1, p2);
            }
        }

        if (Tiles.getFlagOnBomb() == Tiles.getTotalnums()) {
            System.out.println("You have Won Well Done !!!");
            System.exit(0);
        }

        gameBoard.printBoard(gameBoard.DisplayBoard);
    }
}

enum On {
    Left,
    Right,
    Up,
    Down
}