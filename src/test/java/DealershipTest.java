import Dealership.Cars.CarParts.EngineType;
import Dealership.Cars.CarParts.TyreType;
import Dealership.Cars.ElectricCar;
import Dealership.Cars.IceCar;
import Dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class DealershipTest {

    Dealership dealership;
    IceCar car;
    ElectricCar electricCar;

    @Before
    public void before(){
        dealership = new Dealership(250000);
        car = new IceCar(EngineType.PETROL, TyreType.SEVENTEENINCH, "Corsa", 8000, "Red", 0);
        electricCar = new ElectricCar(EngineType.ELECTRIC, TyreType.SEVENTEENINCH, "Tesla", 40000, "Blue", 0);
    }

    @Test
    public void hasMoney() {
        assertEquals(250000, dealership.getTill(), 0.01);
    }

    @Test
    public void hasNoCars() {
        assertEquals(0, dealership.getCarsInStock());
    }

    @Test
    public void canAddCar() {
        dealership.addCar(car);
        assertEquals(1, dealership.getCarsInStock());
    }

    @Test
    public void canRemoveCar() {
        dealership.addCar(car);
        dealership.removeCar(car);
        assertEquals(0, dealership.getCarsInStock());
    }

    @Test
    public void canAddMoney() {
        dealership.addMoney(car.getPrice());
        assertEquals(258000, dealership.getTill(), 0.01);
    }

    @Test
    public void canRemoveMoney() {
        dealership.removeMoney(car.getPrice());
        assertEquals(242000, dealership.getTill(), 0.01);
    }

    @Test
    public void canRepairVehicle() {
        electricCar.addDamage(1000);
        dealership.repair(electricCar);
        electricCar.removeDamage();
        assertEquals(249000, dealership.getTill(), 0.01);
        assertEquals(40000, electricCar.getPrice(), 0.01);
    }
}
