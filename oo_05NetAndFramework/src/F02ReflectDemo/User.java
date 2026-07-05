package F02ReflectDemo;

public class User {
    private String name;
    private int age;
    private String address;
    public  static String company;

    public User() {
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    protected User(String name) {
        this.name = name;
    }

    private User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public  String show() {
        System.out.println("name" +  name + " age" + age);
        return name + " " + age;
    }
    public  void show(String name, int age,String address) {
        System.out.println("name" +  name + " age" + age + " address" + address);
    }
    public  static void study() {
        System.out.println("好好学习");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
