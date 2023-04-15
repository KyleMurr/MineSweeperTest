package org.example;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.


import org.example.Models.*;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        var board = game.gameBoard;

        board.printBoard(board.setDisplayBoard());

        game.Play();
    }
}
