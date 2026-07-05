package comMaven;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


@DisplayName("用户服务测试类")
public class UserServiceAiTest  {

    private UserService userService;

    @BeforeEach
    public void setUp() {
        System.out.println("=== 测试方法开始执行 ===");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("=== 测试方法执行结束 ===");
    }

    @BeforeAll
    public static void initAll() {
        System.out.println("===== 所有测试开始 =====");
    }

    @AfterAll
    public static void cleanupAll() {
        System.out.println("===== 所有测试结束 =====");
    }

    @DisplayName("测试基础功能-正常构造")
    @Test
    public void testBasicConstructor() {
        UserService userService = new UserService("张三", 18);
        Assertions.assertEquals("张三", userService.getName());
        Assertions.assertEquals(18, userService.getAge());
    }

    @DisplayName("测试年龄边界值-最小值")
    @Test
    public void testAgeBoundary_Minimum() {
        UserService userService = new UserService("测试用户", 0);
        Assertions.assertEquals(0, userService.getAge());
        Assertions.assertEquals("测试用户", userService.getName());
    }

    @DisplayName("测试年龄边界值-合理最大值")
    @Test
    public void testAgeBoundary_Maximum() {
        UserService userService = new UserService("测试用户", 150);
        Assertions.assertEquals(150, userService.getAge());
    }

    @DisplayName("测试年龄边界值-负数异常情况")
    @Test
    public void testAgeBoundary_Negative() {
        UserService userService = new UserService("测试用户", -1);
        Assertions.assertEquals(-1, userService.getAge());
    }

    @DisplayName("测试姓名-空字符串")
    @Test
    public void testName_EmptyString() {
        UserService userService = new UserService("", 18);
        Assertions.assertEquals("", userService.getName());
        Assertions.assertEquals(18, userService.getAge());
    }

    @DisplayName("测试姓名-null值")
    @Test
    public void testName_NullValue() {
        UserService userService = new UserService(null, 18);
        Assertions.assertNull(userService.getName());
        Assertions.assertEquals(18, userService.getAge());
    }

    @DisplayName("测试姓名-特殊字符")
    @ParameterizedTest
    @ValueSource(strings = {"@#$%", "   ", "\n\t", "张三丰·"})
    public void testName_SpecialCharacters(String name) {
        UserService userService = new UserService(name, 18);
        Assertions.assertEquals(name, userService.getName());
    }

    @DisplayName("测试姓名-超长字符串")
    @Test
    public void testName_VeryLongString() {
        String longName = "A".repeat(1000);
        UserService userService = new UserService(longName, 18);
        Assertions.assertEquals(longName, userService.getName());
    }

    @DisplayName("测试无参构造函数")
    @Test
    public void testNoArgsConstructor() {
        UserService userService = new UserService();
        Assertions.assertNull(userService.getName());
        Assertions.assertEquals(0, userService.getAge());
    }

    @DisplayName("测试show方法-抛出运行时异常")
    @Test
    public void testShowMethod_ThrowsException() {
        UserService userService = new UserService("张三", 18);
        RuntimeException exception = Assertions.assertThrows(
                RuntimeException.class,
                () -> {
                    userService.show();
                }
        );
        Assertions.assertEquals("抛出一个运行时异常", exception.getMessage());
    }

    @DisplayName("测试setter方法-修改name")
    @Test
    public void testSetName() {
        UserService userService = new UserService("原始名字", 18);
        userService.setName("新名字");
        Assertions.assertEquals("新名字", userService.getName());
    }

    @DisplayName("测试setter方法-修改age")
    @Test
    public void testSetAge() {
        UserService userService = new UserService("张三", 18);
        userService.setAge(25);
        Assertions.assertEquals(25, userService.getAge());
    }

    @DisplayName("参数化测试-验证不同名字的getter和setter")
    @ParameterizedTest
    @ValueSource(strings = {"张三", "小王", "小李"})
    public void testUserService_GetName(String name) {
        int age = 18;
        UserService userService = new UserService(name, age);
        Assertions.assertEquals(name, userService.getName(),
                "期望名字应该是: " + name);
        Assertions.assertEquals(age, userService.getAge(),
                "期望年龄应该是: " + age);
    }

    @DisplayName("参数化测试-年龄边界值")
    @ParameterizedTest
    @ValueSource(ints = {0, 1, 18, 60, 100, 150})
    public void testUserService_AgeBoundaries(int age) {
        UserService userService = new UserService("测试用户", age);
        Assertions.assertEquals(age, userService.getAge());
    }

}
