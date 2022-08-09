import Dealership.Cars.CarParts.EngineType;
import Dealership.Cars.CarParts.TyreType;
import Dealership.Cars.HybridCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    HybridCar hybridCar;

    @Before
    public void before(){
        hybridCar = new HybridCar(EngineType.HYBRID, TyreType.SEVENTEENINCH, "Prius", 20000, "Silver", 0);
    }

    @Test
    public void hasEngine() {
        assertEquals("Hybrid", hybridCar.getEngineType());
    }

    @Test
    public void hasTyres() {
        assertEquals("17 Inch", hybridCar.getTyreType());
    }

    @Test
    public void hasModel() {
        assertEquals("Prius", hybridCar.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(20000, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void hasColor() {
        assertEquals("Silver", hybridCar.getColor());
    }
}

