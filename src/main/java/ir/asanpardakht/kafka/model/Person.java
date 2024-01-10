package ir.asanpardakht.kafka.model;

public class Person {

    public String id;
    public int age;

    /**
     * Default constructor required for Jackson serializer
     */
    public Person() { }

    public Person(String id, int price) {
        this.id = id;
        this.age = price;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}