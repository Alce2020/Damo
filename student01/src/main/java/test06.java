/**
 * @title: test06
 * @Author lijing
 * @Date: 2022/3/23 11:18
 * @Version 1.0
 * @description:
 */
public class test06 implements Runnable {
    int ticnum=10;

        public void run() {
        for (int i = 1; i <100 ; i++) {
            if (ticnum>0){
                System.out.println("我在" + Thread.currentThread().getName() + "窗口买到了去北京的第" + ticnum-- + "张车票");
            }
        }
    }
}
