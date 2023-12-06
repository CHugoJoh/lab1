import com.sun.jdi.connect.Transport;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MechanicTest<T extends Car> {
    Car volvo;
    Car saab;
    Car scandia;
    Mechanic<TransportableCar> mechanic;
    @Before
    public void setup(){
        mechanic = new Mechanic<>();
        volvo = new Volvo240();
        saab = new Saab95();
        scandia = new Scandia();

    }
    @Test
    public void testMechSize(){
        mechanic.setMechSize(10);
        assertEquals(10, mechanic.getMechSize());
    }
    @Test
    public void testLoad(){
        for (int i = 0; i < 8; i++){
            mechanic.load(volvo);
        }
        assertEquals(4, mechanic.carsAtShop.size());
    }
    @Test
    public void testUnLoad(){
        for(int i = 0; i < 4; i++){
            mechanic.load(volvo);
        }
        mechanic.unload(volvo);
        assertEquals(3, mechanic.carsAtShop.size());

    }

}
