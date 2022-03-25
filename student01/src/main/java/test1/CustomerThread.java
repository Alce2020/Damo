package test1;

/**
 * @title: CustomerThread
 * @Author lijing
 * @Date: 2022/3/24 16:00
 * @Version 1.0
 * @description:利用同步方法解决问题
 */
public class CustomerThread extends Thread {
    private Product p;
    public CustomerThread(Product p) {
        this.p = p;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {//i:消费次数
            p.getProduct();
        }
    }
}
