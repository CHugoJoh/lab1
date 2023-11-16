import java.util.*;

public class Mechanic<T extends Car> {
    public void load(T Car){
        ArrayList<T> cars = new ArrayList<>();
        cars.add Car;
    }

}