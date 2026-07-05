package F03AnnotationDemo;


@MyAnnotation(name = "李四", age = 18)
public class Student {
    private String name;
    @MyAnnotation
    private int age;

    public Student() {
    }

    @MyAnnotation
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @MyAnnotation
    public String getName() {
        return name;
    }

    @MyAnnotation
    public void setName(@MyAnnotation String name) {
        this.name = name;
    }
    @MyAnnotation
    public int getAge() {
        return age;
    }
    @MyAnnotation
    public void setAge(int age) {
        this.age = age;
    }
}
