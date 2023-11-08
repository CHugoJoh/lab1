import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
 
    Saab95 saab;

    @Before
    public void setup() {
        saab = new Saab95();
    }
    
    // EMILS TESTS 
    @Test
    public void speedFactor(){
        assertEquals(1.25,saab.speedFactor(), 0.00001);
    }



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

    @Test
    public void testLotsOfGas() {
        saab.gas(69000000);
        assertEquals(125 * 0.01, saab.currentSpeed, 0.0001);
    }


    @Test
    public void getCarColor(){
        assertEquals(saab.getColor(), saab.color);
    }
    @Test
    public void testBrake(){
        saab.brake(1.0);
        assertEquals(-125 * 0.01,saab.currentSpeed,0.000001);
    }
    @Test
    public void testMegaBrake(){
        saab.brake(1000000);
        assertEquals(-125 * 0.01,saab.currentSpeed,0.000001);
    }

    @Test
    public void testNegativeBrake()
    {
        saab.brake(-1.);
        assertEquals(0, saab.currentSpeed, 0.000001);
    }



    // HUGO IDK STOP IF YOU WANT

}
