package DesignPattern.FactoryPattern.AbstractFactory;

public class Client {
    public static void main(String[] args) {
        TransportAbstractFactory factory = TransportFactory.getFactory(TransportType.Gas);
        Motor motor = factory.createMotor();
        motor.create();
        Car car = factory.createCar();
        car.create();

    }
}
