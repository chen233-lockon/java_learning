package o_06CollectionsToolsClass;

//args可变参数：数据类型...参数名称,当做数组(本质数组)来用,仅形参且只能一个
//可变参数必须放在普通形参的后面
public class TestArgs {
    public static void main(String...args) {
        int sum = sum(0, 2, 3, 99, 9, 5, 4);
        System.out.println(sum);
    }

    public static int sum(int sum,int... numbers) {
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }
}
