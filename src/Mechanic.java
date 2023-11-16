import java.lang.reflect.Array;
import java.util.*;

public class Mechanic<T extends Car> {

    public Mechanic(){
        mechSize = 0;
        mechName = "";
    }

    protected static int mechSize;

    protected T mechanic;

    public void setMechanic(T mechanic){
        this.mechanic = mechanic;
        getMechSize();


    }
    public T getMechanic(T mechanic){
        return mechanic;
    }

    public int getMechSize() {
        return mechSize;
    }
    public void setMechSize(int i) {
        mechSize = i;
    }
    protected ArrayList<T> carsAtShop = new ArrayList<>(mechSize);
    public void load(T car){
        if(carsAtShop.size() < mechSize) {
            carsAtShop.add(car);
        }
        else{
            System.out.println("Funk off");
        }
    }

    public void unload(T car){
        if(carsAtShop.contains(car)){
            carsAtShop.remove(car);
        }
        else{
            System.out.println("the car is in another verkstad mate.");
        }

    }
    public ArrayList<T> checkCars(){
        System.out.println(carsAtShop);
        return carsAtShop;}

}
