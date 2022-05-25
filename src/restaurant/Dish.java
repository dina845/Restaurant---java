package restaurant;

public class Dish {
    private Integer Id = generateId();

    private static Integer IdForNextDish = 0;

    private String name;

    private int price;

    private double preparationTime;

    public Dish(String dishName, int price, double preparationTime) {
        this.name = dishName;
        this.price = price;
        this.preparationTime = preparationTime;
    }

    private static Integer generateId() {
        return IdForNextDish++;
    }

    public Integer getId() {
        return Id;
    }

    public static int getPriceOfDish(int id) {
        //toDo fill function
        return 0;
    }
}
