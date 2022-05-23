package DesignPattern.SingletonPattern;

import java.util.HashSet;
import java.util.Set;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton("100-200");
    private final Set<String> availableSeats = new HashSet<>();
    private final String name;

    {
        availableSeats.add("1");
        availableSeats.add("2");
    }

public static EagerInitializedSingleton getInstance(){
        return INSTANCE;
}
    // Hàm khởi tạo riêng để tránh các ứng dụng khách sử dụng hàm tạo
    private EagerInitializedSingleton(String name) {

        this.name = name;
    }

    //instance đã được khởi tạo mà có thể sẽ không dùng tới.

    public boolean bookSeat(String seat){
        return availableSeats.remove(seat);
    }


}
