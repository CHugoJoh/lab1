import org.junit.Assert;
import org.junit.Test;

public class CarTransporterTest {
    CarTransporter transporter = new CarTransporter();

    @Test
    public void TestLoad() {
        transporter.raiseRamp();
        transporter.load(new Saab95());
        Assert.assertEquals(1, transporter.numberOfLoadedCars());
    }

    @Test
    public void TestUnload() {
        transporter.raiseRamp();
        var saab = new Saab95();
        transporter.load(saab);
        transporter.unload();
        Assert.assertEquals(0, transporter.numberOfLoadedCars());
    }

    @Test
    public void TestCantLoadRampLowered() {
        transporter.lowerRamp();
        var saab = new Saab95();
        transporter.load(saab);
        Assert.assertEquals(0, transporter.numberOfLoadedCars());
    }

    @Test
    public void TestCantLoadCarFarAway() {
        transporter.raiseRamp();
        var saab = new Saab95();
        saab.startEngine();
        for (int i = 0; i < 1000; i++)
            saab.move();
        transporter.load(saab);
        Assert.assertEquals(0, transporter.numberOfLoadedCars());
    }

    @Test
    public void TestCarGoWithTransporter() {
        transporter.raiseRamp();
        transporter.startEngine();
        var saab = new Saab95();
        transporter.load(saab);
        for (int i = 0; i < 10; i++)
            transporter.move();
        Assert.assertEquals(1, saab.getX(), 0.00001);
    }
}
