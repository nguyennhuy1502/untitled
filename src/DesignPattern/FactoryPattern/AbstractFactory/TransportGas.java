package DesignPattern.FactoryPattern.AbstractFactory;

public class TransportGas extends TransportAbstractFactory{
    @Override
    public Car createCar() {
        return new CarGas();
    }

    @Override
    public Motor createMotor() {
        return new MotorGas();
    }
}
