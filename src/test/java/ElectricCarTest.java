import Dealership.Cars.CarParts.EngineType;
import Dealership.Cars.CarParts.TyreType;
import Dealership.Cars.ElectricCar;
import Dealership.Cars.IceCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
        ElectricCar electricCar;

        @Before
        public void before(){
            electricCar = new ElectricCar(EngineType.ELECTRIC, TyreType.NINETEENINCH, "Tesla", 40000, "Blue", 0);
        }

        @Test
        public void hasEngine() {
            assertEquals("Electric", electricCar.getEngineType());
        }

        @Test
        public void hasTyres() {
            assertEquals("19 Inch", electricCar.getTyreType());
        }

        @Test
        public void hasModel() {
            assertEquals("Tesla", electricCar.getModel());
        }

        @Test
        public void hasPrice() {
            assertEquals(40000, electricCar.getPrice(), 0.01);
        }

        @Test
        public void hasColor() {
            assertEquals("Blue", electricCar.getColor());
        }
    }

