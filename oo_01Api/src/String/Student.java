package String;

public class Student {
    private String id;
    private String name;
    private int age;
    private double c;
    private double m;
    private double e;
    private String address;

    public Student() {
    }

    public Student(String id, String name, int age,double c, double m, double e, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.c = c;
        this.m = m;
        this.e = e;
        this.address = address;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getM() {
        return m;
    }

    public void setM(double m) {
        this.m = m;
    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        this.e = e;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    //重写

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", c=" + c +
                ", m=" + m +
                ", e=" + e +
                ", address='" + address + '\'' +
                '}';
    }
}
