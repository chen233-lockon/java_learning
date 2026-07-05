import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {
        //TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
        // 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
        IO.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP 按 <shortcut actionId="Debug"/> 开始调试代码。我们已经设置了一个 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 断点
            // 但您始终可以通过按 <shortcut actionId="ToggleLineBreakpoint"/> 添加更多断点。
            IO.println("i = " + i);
        }
    }

    private static final PrintStream IO = System.out;
}