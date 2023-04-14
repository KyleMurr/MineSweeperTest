import org.example.Models.OBJ;
import org.example.Models.bomb;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class OBJtest {

    @Test
    public void TestOBJ (){
        OBJ object = new bomb();
        OBJ.setTotalObs();
        OBJ.setTotalObs();
        OBJ.setTotalObs();
        OBJ.setTotalObs();
        OBJ.setTotalObs();

        Assertions.assertEquals(5,OBJ.getTotalObs(),"Should Be 5 but is: " + OBJ.getTotalObs());
    }
}
