import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ScandiaTest{

    private Scandia scandia;
    @Before
    public void setup() {
        scandia = new Scandia();
    }

    @Test
    public void testRamp(){
        scandia.raiseRamp();
        assertTrue(scandia.getRampDegree() > 0);
    }
    @Test
    public void testIncrementSpeed(){
        scandia.incrementSpeed(100);
        assertEquals(200, scandia.getCurrentSpeed(), 0.000001);
    }
    @Test
    public void testClampDegree(){
        for(int i = 0; i < 80; i++){
            scandia.raiseRamp();
        }
        assertEquals(70, scandia.getRampDegree(), 0.0000001);
    }
    @Test
    public void testRampStop(){
        scandia.raiseRamp();
        scandia.incrementSpeed(100);
        assertTrue("Flaket måste vara nere.", scandia.getCurrentSpeed() == 0);

    }
}
