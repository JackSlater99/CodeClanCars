import Dealership.Cars.CarParts.EngineType;
import Dealership.Cars.CarParts.TyreType;
import Dealership.Cars.ElectricCar;
import Dealership.Cars.HybridCar;
import Dealership.Cars.IceCar;
import Dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalesTest {

    Dealership dealership;
    Customer customer;
    IceCar iceCar;
    HybridCar hybridCar;
    ElectricCar electricCar;

    @Before
    public void before(){
        customer = new Customer(50000);
        dealership = new Dealership(250000);
        iceCar = new IceCar(EngineType.PETROL, TyreType.SEVENTEENINCH, "Corsa", 8000, "Red",0);
        hybridCar = new HybridCar(EngineType.HYBRID, TyreType.SEVENTEENINCH, "Prius", 20000, "Silver", 0);
        electricCar = new ElectricCar(EngineType.ELECTRIC, TyreType.NINETEENINCH, "Tesla", 40000, "Blue", 500);
    }

    @Test
    public void customerCanBuyCar(){
        customer.buyCar(iceCar);
        assertEquals(1, customer.getNumberOfCars());
        assertEquals(42000, customer.getMoney(), 0.01);
    }

    @Test
    public void dealershipCanBuyCar(){
        dealership.buyCar(iceCar);
        assertEquals(1, dealership.getCarsInStock());
        assertEquals(242000, dealership.getTill(), 0.01);
    }

    @Test
    public void dealershipCanSellToCustomer(){
        dealership.addCar(iceCar);
        customer.buyCar(iceCar);
        dealership.sellCar(iceCar);
        assertEquals(0, dealership.getCarsInStock());
        assertEquals(1, customer.getNumberOfCars());
        assertEquals(258000, dealership.getTill(), 0.01);
        assertEquals(42000, customer.getMoney(), 0.01);
    }
}
