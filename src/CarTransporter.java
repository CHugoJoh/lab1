import java.util.*;

public class CarTransporter extends Car implements HasRamp {

    private Stack<Transportable> stack = new Stack<Transportable>(); 
    private int maxLoad;
    private double rampDegree = 0.0;

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

    @Override
    public void raiseRamp() {
        rampDegree = 90;
    }

    @Override
    public void lowerRamp() {
        rampDegree = 0;
    }

    @Override
    public double getRampDegree() {
        return rampDegree;
    }
    
}
