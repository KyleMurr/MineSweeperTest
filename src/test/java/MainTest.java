import org.example.Main;
import org.example.Models.bomb;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest {



    @Test
    public void TestDisplayBoard(){
        var board = Main.setDisplayBoard();

        char board1[][] = new char[9][5];
        for (int i = 0; i < 9; i++) {
            Arrays.fill(board1[i], '?');
        }
        System.out.println("test");
        assertArrayEquals(board1,board,"Board is different should be a 2d array 9 by 5");
    }

    @Test
    public void TestOBJBoard(){
        var board = Main.setBoard();
        int BombNum = 0;
        for (var B:board) {
            for (var k:B) {
               BombNum = k instanceof bomb ? BombNum+1 : BombNum;

            }
        }
        assertTrue(10 <= BombNum && BombNum <= 25);
    }

}
