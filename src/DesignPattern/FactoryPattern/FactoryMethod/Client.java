package DesignPattern.FactoryPattern.FactoryMethod;

public class Client {
    public static void main(String[] args) {
        Car car = CarFactory.getCar(CarType.VinFast);
        System.out.println(car.getName());
    }
}
