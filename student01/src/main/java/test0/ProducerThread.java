package test0;

/**
 * @title: ProducerThread
 * @Author lijing
 * @Date: 2022/3/24 15:57
 * @Version 1.0
 * @description:利用同步代码块解决问题
 */
public class ProducerThread extends Thread {
    private Product p;

    public ProducerThread(Product p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10 ; i++) {//生产十个商品 i:生产的次数
            synchronized (p) {//利用同步代码块解决问题
                if (i % 2 == 0) {
                    //生产费列罗巧克力
                    p.setBrand("费列罗");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("巧克力");
                } else {

                    //生产哈尔滨啤酒
                    p.setBrand("哈尔滨");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    p.setName("啤酒");
                }
                //将生产信息做一个打印：
                System.out.println("生产者生产了：" + p.getBrand() + "---" + p.getName());
            }
        }
    }
}
