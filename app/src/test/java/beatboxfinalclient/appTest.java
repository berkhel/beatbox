package beatboxfinalclient;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class appTest{

    @Test
    public void simpleTest(){
	assertEquals(5,new BeatBoxFinal().simpleSum(2,3));
    }

    @Test
    public void brokenTest(){
	assertEquals(1,1);
    }
}
