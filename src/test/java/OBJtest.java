import org.example.Models.Tiles;
import org.example.Models.bomb;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OBJtest {

    @Test
    public void TestOBJ (){
        Tiles object = new bomb();
        Tiles.setTotalObs();
        Tiles.setTotalObs();
        Tiles.setTotalObs();
        Tiles.setTotalObs();
        Tiles.setTotalObs();

        Assertions.assertEquals(5, Tiles.getTotalObs(),"Should Be 5 but is: " + Tiles.getTotalObs());
    }
}
