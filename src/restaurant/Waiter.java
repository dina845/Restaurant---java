package restaurant;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Waiter extends Person{

    private List orders = new ArrayList<Integer>();
    private boolean isAvailAble = true;

    public boolean isAvailAble() {
        return isAvailAble;
    }


    public Waiter(String name) {
        super(name);
    }

    public void takeOrders(List<Integer> orders){
        takeOrders(orders,false);
    }
    public void takeOrders(List<Integer> orders, boolean prepared ){
        isAvailAble = false;
        if (prepared) {
            bringOrdersToTable(orders);
        }
        else{
            bringOrdersToKitchen(orders);
        }
        isAvailAble = true;
    }

    public void takeOrder(Integer order, boolean prepared){
        takeOrders(new ArrayList<Integer>(Arrays.asList(order)), prepared);
    }
    public void takeOrder(Integer order){
        takeOrder(order, false);
    }
    private static void bringOrdersToKitchen(List<Integer> orders){
        Chef currentChef = RestaurantInfra.currentChef;
        currentChef.getOrders(orders);
    }
    private static void bringOrdersToTable(List<Integer> orders){
        Chef currentChef = RestaurantInfra.currentChef;
    }
}
