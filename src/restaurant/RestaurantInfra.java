package restaurant;

import java.util.*;

public class RestaurantInfra {
    //Restaurant static fields

    static int NextId = 0;

    // workers
    static Chef currentChef = new Chef("Special Chef");

    static List<Waiter> AllWaiters = new ArrayList<Waiter>(Arrays.asList(
            new Waiter("Shalom"),
            new Waiter("Baruch")
    ));


    //table
    static Table tableA = new Table();

    //initial menu
    static final Menu menuInstance = Menu.getInstance(
        new HashMap<String,Dish>(){{
            put("Smoked salmon", new Dish("Smoked salmon", 20, 0.5));
            put("Borax with mushroom sauce", new Dish("Borax with mushroom sauce", 10,0.25));
            put("Rise", new Dish("Rise", 10, 0.5));
        }}
    );
    //
    static final Map<String,Dish> menuList = menuInstance.getDishesMap();

    //orders list
    public static List<Order> allOrders = new ArrayList<Order>();

}
