package restaurant;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

import static restaurant.RestaurantInfra.allOrders;

public class Chef extends Person {
    private List ToPrepare = new ArrayList<Order>();
    ArrayDeque<Integer> ordersQue = new ArrayDeque<Integer>();
    boolean isBusy = false;

    public Chef(String name) {
        super(name);
    }

    public void getOrders(List<Integer> orders) {
        orders.forEach(o -> {
            ordersQue.addLast(o);
            System.out.println(o);
        });
        if (!isBusy) {
            Integer orderId = ordersQue.peekFirst();
            Order orderToPrepar = allOrders.stream().filter(o->o.getId() == orderId).findFirst().get();
            preparOrder(orderToPrepar);
        }
    }

    private void preparOrder(Order orderToPrepar) {//double or float?
        double orderPreparetionTime = orderToPrepar.calculatePreparetion();
        //setTimeOut time - (int)orderPreparetionTime + (1- orderPreparetionTime%1) ther is function?
        Waiter availableWaiter = Restaurant.getAvailableWaiter();
        availableWaiter.takeOrder(orderToPrepar.getId(),true);
    }
}
