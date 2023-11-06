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



    // EMIL STOP TESTING

    // WILLIAMS TESTS




    // WILLIAM STOP TESTING

    // HUGO TESTS
    @Test
    public void getCarColor(){
        assertEquals(saab.getColor(), saab.color);
    }
    @Test
    public void testBrake(){
        saab.brake(1.0);
        assertEquals(-125 * 0.01,saab.currentSpeed,0.000001);
    }


    
    // HUGO IDK STOP IF YOU WANT

}
