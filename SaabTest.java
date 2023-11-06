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
}
