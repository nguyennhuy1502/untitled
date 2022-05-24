package DesignPattern.FactoryPattern.AbstractFactory;

public class MotorElectric implements Motor{
    @Override
    public void create() {
        System.out.println("Create Motor Electric! ");
    }
}
