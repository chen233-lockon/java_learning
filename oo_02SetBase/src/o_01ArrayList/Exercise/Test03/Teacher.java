package o_01ArrayList.Exercise.Test03;

public class Teacher extends Employee{
    public Teacher() {
    }

    public Teacher(String name) {
        super(name);
    }
    @Override
    public String getName(){
        return super.getName();
    }
    @Override
    public  void setName(String name){
        super.setName(name);
    }

    @Override
    public void study() {
        System.out.println("学习Java知识");
    }

    @Override
    public void work() {
        System.out.println("上课");
    }
    @Override
    public String toString() {
        return "老师姓名为:" + getName();
    }
}
