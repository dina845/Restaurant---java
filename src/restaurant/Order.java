package restaurant;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Integer id = Restaurant.getNextId();
    private Integer customerId;
    private List<Integer> dishes = new ArrayList<Integer>();

    public Order(Integer customerId) {
        this.customerId = customerId;
        //Restaurant.allOrders.add(this);
    }

    public Order(Integer customerId, Integer dishId) {
        this.customerId = customerId;
        dishes.add(dishId);
    }

    public Order(Integer customerId, ArrayList<Integer> dishesId) {
        this.customerId = customerId;
        this.dishes.addAll(dishesId);
    }

    public void AddDish(Integer dishId){
        dishes.add(dishId);
    }
    public void AddDishes(ArrayList<Integer> dishesId){
        this.dishes.addAll(dishesId);
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public double calculatePreparetion(){
        //toDo sum dishes preparetion time
        return 5;
    }

    public double calculateOrderPrice(){
        //toDo sum dishes price
        return 50;
    }

    public Integer getId() {
        return id;
    }


}
