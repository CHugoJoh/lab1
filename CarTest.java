import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
 
    Car saab;

    @Before
    public void setup() {
        saab = new Saab95();
    }
    
    // EMILS TESTS 
    @Test
    public void testSpeedFactor(){
        assertEquals(1.25,saab.speedFactor(), 0.00001);
    }

    @Test
    public void testCurrentSpeedMax(){
        for (int i = 0; i < 1000; i++){
            saab.gas(1.0); 
        }
        assertTrue(saab.getCurrentSpeed() <= saab.getEnginePower());
    }
    @Test
    public void testCurrentSpeedMin(){
        for (int i = 0; i < 1000; i++){
            saab.gas(1.0);
        }
        saab.brake(1.0);
        assertTrue(saab.getCurrentSpeed() >= 0);
    }
    // EMIL STOP TESTING

    // WILLIAMS TESTS

    @Test
    public void testCurrentSpeed() {
        assertEquals(0.0, saab.getCurrentSpeed(), 0.0001);
    }

    @Test
    public void testStartEngine() {
        saab.startEngine();
        assertEquals(0.1, saab.getCurrentSpeed(), 0.0001);
    }

    @Test
    public void testStopEngine() {
        saab.startEngine();
        saab.stopEngine();
        assertEquals(0.0, saab.getCurrentSpeed(), 0.0001);
    }

    @Test
    public void testGas() {
        saab.gas(1.0);
        assertEquals(125 * 0.01, saab.getCurrentSpeed(), 0.0001);
    }

    @Test
    public void testLotsOfGas() {
        saab.gas(69000000);
        assertEquals(125 * 0.01, saab.getCurrentSpeed(), 0.0001);
    }


    @Test
    public void getCarColor(){
        assertEquals(saab.getColor(), saab.color);
    }
    @Test
    public void testBrake(){
        saab.gas(1.0);
        saab.gas(1.0);
        saab.brake(1.0);
        assertEquals(125 * 0.01,saab.getCurrentSpeed(),0.000001);
    }


    @Test
    public void testNegativeBrake()
    {
        saab.brake(-1);
        assertEquals(0, saab.getCurrentSpeed(), 0.000001);
    }
    @Test
    public void testNegativeGas()
    {
        saab.gas(-1);
        assertEquals(0, saab.getCurrentSpeed(), 0.000001);
    }

    @Test
    public void testGasLoweredSpeed(){
        saab.gas(-1.0);
        assertTrue(saab.getCurrentSpeed() >= 0);
    }
    @Test
    public void testBrakeLoweredSpeed(){
        saab.brake(-1.0);
        assertTrue(saab.getCurrentSpeed() >= 0);
    }


    // HUGO IDK STOP IF YOU WANT


}
