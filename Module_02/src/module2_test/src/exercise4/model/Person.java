package exercise4.model;

public abstract class Person {
    /*
    Tính bao đóng
     */
    private String id;
    private String name;
    /*
    Tính đa hình
     */
    protected Person() {
    }

    protected Person(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*
    Tính trừu tượng
     */
    public abstract String getInfo();

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
