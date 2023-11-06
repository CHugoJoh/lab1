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
    @Test
    public void speedFactor(){
        assertEquals(1.25,saab.speedFactor(), 0.00001);
    }



    // EMIL STOP TESTING

    // WILLIAMS TESTS




    // WILLIAM STOP TESTING

    // HUGO TESTS




    
    // HUGO IDK STOP IF YOU WANT

}
