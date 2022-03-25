/**
 * @title: test08
 * @Author lijing
 * @Date: 2022/3/23 11:30
 * @Version 1.0
 * @description:
 */
public class test08 {
    public static void main(String[] args) {
        test06 t = new test06();
        Thread t1=new Thread(t,"一号窗口");
        t1.start();
        Thread t2=new Thread(t,"二号窗口");
        t2.start();
        Thread t3=new Thread(t,"三号窗口");
        t3.start();
    }
}
