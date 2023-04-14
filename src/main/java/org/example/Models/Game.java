package org.example.Models;

public class Game {

   public Board gameBoard;

   public Game(){
        gameBoard = new Board();
    }

    public OnTile checkInput(int p1, int p2){

      var grid =  gameBoard.Grid_ItemPos;
      if(grid[p1][p2] instanceof bomb ){
          return OnTile.Bomb;
      }else if(grid[p1][p2] instanceof numbers ){
          return  OnTile.Number;
      }else{
          return OnTile.Found;
      }

    }
}
enum OnTile {
    Found,
    Bomb,
    Number
}