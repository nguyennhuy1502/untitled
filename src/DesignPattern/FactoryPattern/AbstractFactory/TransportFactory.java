package DesignPattern.FactoryPattern.AbstractFactory;

public class TransportFactory {

    private TransportFactory() {
    }

    public static TransportAbstractFactory getFactory(TransportType transportType){
        switch (transportType){
            case Gas:
                return new TransportGas();
            case Electric:
                return new TransportElectric();
            default:
                throw new UnsupportedOperationException("No Input!");
        }
    }
}
