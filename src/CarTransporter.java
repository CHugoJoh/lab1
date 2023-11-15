import java.util.*;

public class CarTransporter extends Car {

    private Stack<Transportable> stack = new Stack<Transportable>(); 
    private int maxLoad;

    CarTransporter() {
        maxLoad = 8;
    }

    @Override
    protected double speedFactor() {
        // TODO: Make more sense
        return enginePower - maxLoad / (stack.size() + 1.0); 
    }

    @Override
    protected void incrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    @Override
    protected void decrementSpeed(double amount) {
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }
    
}
