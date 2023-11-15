import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ScandiaTest{

    private Scandia scandia;
    @Before
    public void setup() {
        scandia = new Scandia();
    }

    @Test
    public void testRamp(){
        scandia.raiseRamp (99999999.0);
        assertEquals(70.0,scandia.getRampDegree());
    }
}
