package o_01ArrayList.Test01;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "学生信息{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + age +
                '}';
    }
}
