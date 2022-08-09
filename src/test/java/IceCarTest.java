import Dealership.Cars.CarParts.EngineType;
import Dealership.Cars.CarParts.TyreType;
import Dealership.Cars.IceCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCarTest {

    IceCar iceCar;

    @Before
    public void before(){
        iceCar = new IceCar(EngineType.PETROL, TyreType.SEVENTEENINCH, "Corsa", 8000, "Red", 0);
    }

    @Test
    public void hasEngine() {
        assertEquals("Petrol", iceCar.getEngineType());
    }

    @Test
    public void hasTyres() {
        assertEquals("17 Inch", iceCar.getTyreType());
    }

    @Test
    public void hasModel() {
        assertEquals("Corsa", iceCar.getModel());
    }

    @Test
    public void hasPrice() {
        assertEquals(8000, iceCar.getPrice(), 0.01);
    }

    @Test
    public void hasColor() {
        assertEquals("Red", iceCar.getColor());
    }

    @Test
    public void hasNoDamage() {
        assertEquals(0, iceCar.getDamage(), 0.01);
    }

    @Test
    public void canAddDamage() {
        iceCar.addDamage(500);
        assertEquals(500, iceCar.getDamage(), 0.01);
        assertEquals(7500, iceCar.getPrice(), 0.01);
    }

    @Test
    public void canRemoveDamage() {
        iceCar.addDamage(500);
        iceCar.removeDamage();
        assertEquals(0, iceCar.getDamage(), 0.01);
        assertEquals(8000, iceCar.getPrice(), 0.01);
    }
}
