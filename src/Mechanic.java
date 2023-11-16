import java.util.*;

public class Mechanic<T extends Car> {
    protected static int mechSize;

    public int getMechSize() {
        return mechSize;
    }
    public void setMechSize(int i) {
        mechSize = i;
    }
    protected ArrayList<T> carsAtShop = new ArrayList<>(mechSize);
    public void load(T car){
        carsAtShop.add(car);
    }

    public void unload(T car){
        if(carsAtShop.contains(car)){
            carsAtShop.remove(car);
        }
        else{
            System.out.println("the car is in another verkstad mate.");
        }

    }

}
