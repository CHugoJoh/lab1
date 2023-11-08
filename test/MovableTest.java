import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MovableTest {

    // We will only test the implemented methods from movable
    private Saab95 movable;

    @Before
    public void setup() {
        movable = new Saab95();
    }

    @Test
    public void testMoveForward() {
        movable.startEngine();
        movable.move();
        Assert.assertEquals(0.1, movable.getX(), 0.000001);
        Assert.assertEquals(0.0, movable.getY(), 0.000001);
    }

    @Test
    public void testMoveBackward() {
        movable.startEngine();
        movable.turnLeft();
        movable.turnLeft(); 
        movable.move();
        Assert.assertEquals(-0.1, movable.getX(), 0.000001);
        Assert.assertEquals(0.0, movable.getY(), 0.000001);
    }

    @Test
    public void testTurnLeft() {
        movable.turnLeft();
        movable.startEngine();
        movable.move();
        Assert.assertEquals(0.0, movable.getX(), 0.000001);
        Assert.assertEquals(-0.1, movable.getY(), 0.000001);
    }

    @Test
    public void testTurnRight() {
        movable.turnRight();
        movable.startEngine();
        movable.move();
        Assert.assertEquals(0.0, movable.getX(), 0.000001);
        Assert.assertEquals(0.1, movable.getY(), 0.000001);
    }

    @Test
    public void testSpinAroundALot() {
        movable.startEngine();
        movable.turnRight();
        movable.turnRight();
        movable.turnRight();
        movable.turnRight();
        movable.turnRight();
        movable.turnRight();
        movable.turnRight();
        movable.turnRight();
        movable.turnLeft();
        movable.turnLeft();
        movable.turnLeft();
        movable.turnLeft();
        movable.turnLeft();
        movable.move();
        Assert.assertEquals(0.0, movable.getX(), 0.000001);
        Assert.assertEquals(-0.1, movable.getY(), 0.000001);
    }
}
