package DesignPattern.FactoryPattern.AbstractFactory;

public class CarElectric implements Car{
    @Override
    public void create() {
        System.out.println("Create Car Electric! ");
    }
}
