import java.util.*;

public class CarTransporter extends Car implements HasRamp {

    final double rampDownDegree = 20.0;
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
        if (currentSpeed > 0.000000001) 
            System.out.println("Hallå stå still om du ska göra så!");
        else
            rampDegree = rampDownDegree;
    }

    @Override
    public void lowerRamp() {
        rampDegree = 0;
    }

    @Override
    public double getRampDegree() {
        return rampDegree;
    }
    
    private boolean isRampDown() {
        return Math.abs(rampDegree - rampDownDegree) < 0.0000001;
    }

    public void load(Transportable transportable) {
        if (!isRampDown())
            System.out.println("Men släpp ner rampen dårå!");

    }

}
