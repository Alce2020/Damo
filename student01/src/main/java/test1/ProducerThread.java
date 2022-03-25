package test1;

/**
 * @title: ProducerThread
 * @Author lijing
 * @Date: 2022/3/24 15:57
 * @Version 1.0
 * @description:利用同步方法解决问题
 */
public class ProducerThread extends Thread {
    private Product p;

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {//生产十个商品 i:生产的次数
                if (i % 2 == 0) {
                   p.setProduct("弗洛里","巧克力");
                } else {
                   p.setProduct("哈尔滨","啤酒");
                }
        }
    }
}
