package Food.DAO;

import java.util.ArrayList;
import java.util.List;

public class Data {
    public static List<Order> orderList = new ArrayList<>();
    private static void addFool(){
        orderList.add(new Order("D01","Tra Dao Cam Sa","Drink"));
        orderList.add(new Order("D02","Tra Chanh Dao","Drink"));
        orderList.add(new Order("D03","Tra Sen Vang","Drink"));
        orderList.add(new Order("D04","Tra Thanh Dao","Drink"));
        orderList.add(new Order("D05","Tra Thach Vai","Drink"));

        orderList.add(new Order("C01","Cafe den da","Drink"));
        orderList.add(new Order("C02","Cafe sua da","Drink"));
        orderList.add(new Order("C03","Cafe nong","Drink"));

        orderList.add(new Order("B01","Banh Kem","Food"));
        orderList.add(new Order("B02","Banh Quy","Drink"));
    }
    public static List<Order> getOrderList(){
        if (orderList.size() == 0){
            addFool();
        }
        return orderList;
    }
}
