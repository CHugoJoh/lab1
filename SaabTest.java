import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SaabTest {
    private Saab95 saab;
    
    @Before
    public void setup() {
        saab = new Saab95();
    }

    @Test
    public void testSaabMove() {
        saab.move();
        assertEquals(0.0, saab.getX(), 0.00001);
        assertEquals(0.0, saab.getY(), 0.00001);
    }
    @Test
    public void turboOff() {
        saab.startEngine();
        saab.gas(1.0);
        saab.getCurrentSpeed();
        assertEquals(1.35,saab.getCurrentSpeed(), 0.00001);
    }
    @Test
    public void turboOn(){
        saab.startEngine();
        saab.setTurboOn();
        saab.gas(1.0);
        saab.getCurrentSpeed();
        assertEquals(1.725,saab.getCurrentSpeed(), 0.00001);
    }
}
