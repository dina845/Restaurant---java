package restaurant;

public abstract class Person {
    private Integer Id = generateId();
    private String name;
    private static Integer IdForNextPerson = 0;

    public Person(String name) {
        this.name = name;
    }

    private Integer generateId() {
        return IdForNextPerson++;
    }

    public Integer getId() {
        return Id;
    }
}
