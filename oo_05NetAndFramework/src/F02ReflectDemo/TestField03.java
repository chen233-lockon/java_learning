package F02ReflectDemo;

import java.lang.reflect.Field;

//反射获取字段
public class TestField03 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<User> userClass = User.class;
//        获取所有公共的字段
        Field[] fields = userClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("-------------------------");
//        获取所有字段
        Field[] declaredFields = userClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
        System.out.println("-------------------------");

//        获取指定字段name
        User user1 = new User(18, "张三");
        User user2 = new User(19, "李四");
        Field nameField = userClass.getDeclaredField("name");
        //        暴力反射
        nameField.setAccessible(true);
        String value = (String) nameField.get(user1);
        System.out.println(value);
        System.out.println("----------------------");
//        通过反射修改字段值
        System.out.println(user1);
        nameField.set(user1, "王五");
        System.out.println(user1);
        System.out.println("---------------------");
//        设置静态字段company,不依赖对象
        Field companyField = userClass.getDeclaredField("company");
        System.out.println(User.company);
        companyField.set(null, "传智播客");//不依赖对象传递 null
        System.out.println(User.company);
    }
}
