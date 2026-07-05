package o_01ArrayList.Exercise.Test03;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("李华");
        Consultant c1 = new Consultant("王五");
        t1.work();
        t1.study();
        System.out.println(t1.toString());
        c1.work();
        c1.study();
        System.out.println(c1.toString());
    }
}
