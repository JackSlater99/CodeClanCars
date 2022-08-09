import Dealership.Cars.Car;

import java.util.ArrayList;

public class Customer {
    private double money;
    private ArrayList<Car> carsOwned;

    public Customer(double money) {
        this.money = money;
        this.carsOwned = new ArrayList<>();
    }

    public double getMoney() {
        return this.money;
    }

    public int getNumberOfCars() {
        return carsOwned.size();
    }

    public void addCar(Car car) {
        carsOwned.add(car);
    }

    public void removeCar(Car car) {
        carsOwned.remove(car);
    }

    public void addMoney(double price) {
        money += price;
    }

    public void removeMoney(double price) {
        money -= price;
    }

    public void buyCar(Car car) {
        double carPrice = car.getPrice();
        if (money > carPrice) {
            money -= carPrice;
            carsOwned.add(car);
        }
    }
}