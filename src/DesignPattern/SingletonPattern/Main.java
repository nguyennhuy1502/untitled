package DesignPattern.SingletonPattern;

public class Main {
    public static void main(String[] args) {
        bookSeat("1");
        bookSeat("1");
    }

    static void bookSeat(String seat){
        EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
        System.out.println(eagerInitializedSingleton);
        System.out.println(eagerInitializedSingleton.bookSeat(seat));
    }
}
