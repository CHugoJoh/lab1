import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class VolvoTest {
    private Volvo240 volvo;

    @Before
    public void setup(){volvo = new Volvo240();}

    @Test
    public void testVolvoMove()
    {
        volvo.move();
        assertEquals(0, volvo.getX(),0.00001);
        assertEquals(0, volvo.getY(),0.00001);
    }
    @Test
    public void testVolvoSpeed()
    {
        volvo.speedFactor();
        assertEquals(1.25, volvo.speedFactor(), 0.00001);

    }

    @Test
    public void testVolvoName()
    {
        assertEquals("Volvo240", volvo.modelName);
    }
    @Test
    public void testVolvoColor()
    {
        assertEquals(volvo.getColor(), volvo.color);
    }
    @Test
    public void testVolvoDoors()
    {
        assertEquals(volvo.getNrDoors(), volvo.nrDoors);
    }
}
