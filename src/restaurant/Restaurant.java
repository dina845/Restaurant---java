package restaurant;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static restaurant.RestaurantInfra.*;

public class Restaurant {

    //Restaurant static Functions

    //toDo return hashCod
    public static int getNextId() {
        return NextId++;
    }

    public static List<Integer> getAllOrdersOfTable(){
        return (ArrayList<Integer>)allOrders.stream().filter(o -> tableA.customersId.contains(o.getCustomerId()) == true).map(Order::getId).collect(Collectors.toList());
    }

    public static Waiter getAvailableWaiter(){
        return AllWaiters.stream().filter(e -> e.isAvailAble() == true).findFirst().get();
    }

    public static void main(String[] args) throws UnsupportedEncodingException {

        Customer oneCustomer = new Customer("Moshe");
        tableA.addCustomer(oneCustomer.getId());
        allOrders.add(new Order(oneCustomer.getId(),menuList.get("Smoked salmon").getId()));
        Waiter availableWaiter = getAvailableWaiter();
        availableWaiter.takeOrders(getAllOrdersOfTable());//mulltiple tables
        System.out.println(allOrders);

    }
}
