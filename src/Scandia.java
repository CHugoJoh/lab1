import java.awt.*;

public class Scandia extends Car {
    private static int platformDegree = 0;

    public Scandia(){
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

    public void setPlatformDegree(int degree){
        platformDegree = degree;
    }
    public int getPlatformDegree(){
        return platformDegree;
    }

    public void clampDegree() {
        if (getPlatformDegree() < 0.0) {
            setPlatformDegree(0);
        } else if (getPlatformDegree() > 70) {
            setPlatformDegree(70);
        }
    }

    public void raise(int amount) {
        if (getCurrentSpeed() == 0) {
            setPlatformDegree(amount);
            clampDegree();
        } else {
            System.out.println("Du står inte stilla. Parkera först.");
        }


    }


}