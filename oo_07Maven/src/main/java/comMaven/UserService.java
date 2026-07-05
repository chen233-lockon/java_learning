package comMaven;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserService {
    private String name;
    private int age;
    public void show() {
        System.out.println("name:" + name + " age:" + age);
        throw new RuntimeException("抛出一个运行时异常");
    }
}
