package DesignPattern.FactoryPattern.AbstractFactory;

public class CarGas implements Car{
    @Override
    public void create() {
        System.out.println("Create Gas Car! ");
    }
}
