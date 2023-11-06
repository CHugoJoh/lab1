import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
 
    Saab95 saab;

    @Before
    public void setup() {
        saab = new Saab95();
    }
    
    // EMILS TESTS 



    // EMIL STOP TESTING

    // WILLIAMS TESTS

    @Test
    public void testCurrentSpeed() {
        assertEquals(0.0, saab.currentSpeed, 0.0001);
    }

    @Test
    public void testStartEngine() {
        saab.startEngine();
        assertEquals(0.1, saab.currentSpeed, 0.0001);
    }

    @Test
    public void testStopEngine() {
        saab.startEngine();
        saab.stopEngine();
        assertEquals(0.0, saab.currentSpeed, 0.0001);
    }

    @Test
    public void testGas() {
        saab.gas(1.0);
        assertEquals(125 * 0.01, saab.currentSpeed, 0.0001);
    }


    // WILLIAM STOP TESTING

    // HUGO TESTS





    // HUGO IDK STOP IF YOU WANT

}
