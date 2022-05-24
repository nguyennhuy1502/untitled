package DesignPattern.FactoryPattern.FactoryMethod;

public class CarFactory {
    private CarFactory() {
    }
    public static final Car getCar(CarType cartype){
        switch (cartype){
            case HonDa:
                return new HonDa();
            case Toyota:
                return new Toyota();
            case VinFast:
                return  new VinFast();
            default:
                throw new IllegalArgumentException("No Input");
        }
    }
}
