import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestScandia{

    private Scandia scandia;
    @Before
    public void setup() {
        scandia = new Scandia();
    }

    @Test
    public void testRamp(){
        scandia.raise(99999999);
        assertEquals(70,scandia.getPlatformDegree());
    }
}
