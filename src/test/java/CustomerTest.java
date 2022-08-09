import Dealership.Cars.CarParts.EngineType;
import Dealership.Cars.CarParts.TyreType;
import Dealership.Cars.IceCar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    Customer customer;
    IceCar car;

    @Before
    public void before(){
        customer = new Customer(50000);
        car = new IceCar(EngineType.PETROL, TyreType.SEVENTEENINCH, "Corsa", 8000, "Red", 0);
    }

    @Test
    public void hasMoney() {
        assertEquals(50000, customer.getMoney(), 0.01);
    }

    @Test
    public void hasNoCars() {
        assertEquals(0, customer.getNumberOfCars());
    }

    @Test
    public void canAddCar() {
        customer.addCar(car);
        assertEquals(1, customer.getNumberOfCars());
    }

    @Test
    public void canRemoveCar() {
        customer.addCar(car);
        customer.removeCar(car);
        assertEquals(0, customer.getNumberOfCars());
    }

    @Test
    public void canAddMoney() {
        customer.addMoney(car.getPrice());
        assertEquals(58000, customer.getMoney(), 0.01);
    }

    @Test
    public void canRemoveMoney() {
        customer.removeMoney(car.getPrice());
        assertEquals(42000, customer.getMoney(), 0.01);
    }
}
