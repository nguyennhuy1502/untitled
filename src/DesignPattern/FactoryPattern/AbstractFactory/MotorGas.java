package DesignPattern.FactoryPattern.AbstractFactory;

public class MotorGas implements Motor{
    @Override
    public void create() {
        System.out.println("Create Motor Gas");
    }
}
