import org.example.Main;
import org.example.Models.bomb;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.example.Main.*;
//import static org.example.Main.CheckInput;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {

    @Test
    public void TestDisplayBoard(){
//        var board = setDisplayBoard();
//        char[][] board1 = new char[9][5];
//        for (int i = 0; i < 9; i++) {
//            Arrays.fill(board1[i], '?');
//        }
//        System.out.println("test");
//        assertArrayEquals(board1,board,"Board is different should be a 2d array 9 by 5");
    }

    @Test
    public void TestOBJBoard(){
//        var board = setBoard();
//        int BombNum = 0;
//        for (var B:board) {
//            for (var k:B) {
//               BombNum = k instanceof bomb ? BombNum+1 : BombNum;
//            }
//        }
//        assertTrue(10 <= BombNum && BombNum <= 25);
    }

    @Test
    public void TestGame(){
//        int[] nums = new int[]{1,2,3,4,5};
//        char[] chars1 = new char[]{'1','2','3','4','5','6','7','8','9'};
//        int i = 0;
//        var board = setDisplayBoard();
//        var board1  = setBoard();
//        printBoard(board,chars1,i,nums);
//        board[1][2] = '+';
//        var value = CheckInput(1,2,board1,board);
//        Assertions.assertEquals(true,value,"Should return false as value Character is + ");
//        board[1][1] = '+';
    }
}
