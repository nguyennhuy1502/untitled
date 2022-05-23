package DesignPattern.SingletonPattern;

public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }
//Kiem tra xem dux lieu da duoc khoi tao chua
    //ap dung tot cho don luong
    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
