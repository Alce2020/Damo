/**
 * @title: test10
 * @Author lijing
 * @Date: 2022/3/23 15:58
 * @Version 1.0
 * @description:线程的优先级
 */
public class test10 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <10 ; i++) {
            System.out.println(i);
        }
    }
}


class test11 extends Thread{
    @Override
    public void run() {
        for (int i = 20; i <30 ; i++) {
            System.out.println(i);
        }
    }
}


class test{
    public static void main(String[] args) {
        test10 t10=new test10();
        t10.setPriority(10);
        t10.start();

        test11 t11=new test11();
        t11.setPriority(1);
        t11.start();
    }
}