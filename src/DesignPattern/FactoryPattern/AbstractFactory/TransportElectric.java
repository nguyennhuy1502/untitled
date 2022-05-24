package DesignPattern.FactoryPattern.AbstractFactory;

public class TransportElectric extends TransportAbstractFactory{
    @Override
    public Car createCar() {
        return new CarElectric();
    }

    @Override
    public Motor createMotor() {
        return new MotorElectric();
    }
}
