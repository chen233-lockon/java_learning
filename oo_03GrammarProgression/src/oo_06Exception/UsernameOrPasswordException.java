package oo_06Exception;
//自定义异常类：代表用户名或密码错误
public class UsernameOrPasswordException extends RuntimeException {
//    强制使用带参构造器
    public UsernameOrPasswordException(String message) {
        super(message);
    }
}
