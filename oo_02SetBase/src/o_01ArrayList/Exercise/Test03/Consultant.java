package o_01ArrayList.Exercise.Test03;

public class Consultant extends Employee{
    public Consultant() {
    }

    public Consultant(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void study() {
        System.out.println("学习咨询行业的知识");
    }

    @Override
    public void work() {
        System.out.println("提供咨询服务");
    }

    @Override
    public String toString() {
        return "咨询员的姓名为:"+ getName();
    }
}
