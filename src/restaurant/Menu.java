package restaurant;

import java.util.Map;

public  class Menu {
    private static Menu menuInstance = null;
    private Map<String,Dish> dishesMap;

    private Menu(Map<String,Dish> dishesMap){
        this.dishesMap = dishesMap;
    }

    public static Menu getInstance(Map<String,Dish> dishesMap)
    {
        if (menuInstance == null)
            menuInstance = new Menu(dishesMap);

        return menuInstance;
    }

    public Map<String, Dish> getDishesMap() {
        return dishesMap;
    }

}
