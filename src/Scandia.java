import java.awt.*;

public class Scandia extends Car {
    private static double platformDegree = 0;

    public Scandia() {
        nrDoors = 2000;
        enginePower = 200;
        color = Color.red;
        modelName = "Scania";
        platformDegree = 0;

        stopEngine();
    }

    @Override
    protected double speedFactor() {
        return 0;
    }

    @Override
    protected void incrementSpeed(double amount) {

    }

    @Override
    protected void decrementSpeed(double amount) {

    }

    public int getPlatformDegree() {
        return platformDegree;
    }

    public void clampDegree() {
        if (getPlatformDegree() < 0.0) {
            platformDegree = 0;
        } else if (getPlatformDegree() > 70) {
            platformDegree = 70;
        }
    }

    public void raise(int amount) {
        if (getCurrentSpeed() == 0.0) {
            platformDegree += amount;
            clampDegree();
        } else {
            System.out.println("Du står inte stilla. Parkera först.");
        }
    }

    public void lower(int amount) {
        if (getCurrentSpeed() == 0.0) {
            platformDegree -= amount;
            clampDegree();
        } else {
            System.out.println("Du står inte stilla. Parkera först.");
        }


    }
    @Override
    public void gas(double amount){
        if(getPlatformDegree() != 0 ){
            System.out.println("Flaket måste vara nere lol");
            }
        else{
            incrementSpeed(amount);
        }
    }
    @Override
    public void brake(double amount){
        if(getPlatformDegree() != 0 ){
            System.out.println("Flaket måste vara nere lol");
        }
        else{
            decrementSpeed(amount);
        }
    }
}