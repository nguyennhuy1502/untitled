package DesignPattern.SingletonPattern;

public class ThreadSafeLazyInitializedSingleton {
    private static volatile ThreadSafeLazyInitializedSingleton instance;

    private ThreadSafeLazyInitializedSingleton() {
    }

    //hệ thống đảm bảo rằng tại cùng một thời điểm chỉ có thể có 1 luồng có thể truy cập vào hàm getInstance() và đảm bảo rằng chỉ có duy nhất 1 thể hiện của class.
    public static synchronized ThreadSafeLazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyInitializedSingleton();
        }
        return instance;
    }
    //Biến volatile trong Java có tác dụng thông báo sự thay đổi giá trị của biến tới các thread khác nhau nếu biến này đang được sử dụng trong nhiều thread.
    //chạy rất chậm và tốn hiệu năng
}
