/**
 * @title: test04
 * @Author lijing
 * @Date: 2022/3/23 10:39
 * @Version 1.0
 * @description:火车票线程类
 */
public class test04 extends Thread {
    public test04(String name){
        super(name);
    }

    static int tickenum = 10;

    @Override
    public void run() {
        for (int i = 1; i <100 ; i++) {
            if (tickenum>0) {
                System.out.println("我在" + this.getName() + "窗口买到了去北京的第" + tickenum-- + "张车票");
            }
        }
    }
}
