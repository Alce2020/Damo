/**
 * @title: test05
 * @Author lijing
 * @Date: 2022/3/23 11:05
 * @Version 1.0
 * @description:测试类
 */
public class test05 {
    public static void main(String[] args) {
        test04 t1 = new test04("一号窗口");
        t1.start();
        test04 t2 = new test04("二号窗口");
        t2.start();
        test04 t3 = new test04("三号窗口");
        t3.start();
    }
}
