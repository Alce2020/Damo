package test1;

/**
 * @title: Product
 * @Author lijing
 * @Date: 2022/3/24 15:55
 * @Version 1.0
 * @description:利用同步方法解决问题
 */
public class Product {
    private String brand;
    private String name;

    boolean flag = false;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //生产商品
    public synchronized void setProduct(String brand,String name){
        if (flag==true) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (flag == false){
            this.setBrand(brand);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setName(name);
            //将生产信息做一个打印：
            System.out.println("生产者生产了：" + this.getBrand() + "---" + this.getName());
            //生产完以后，灯变色：变成红色：
            flag = true;
            //告诉消费者赶紧来消费：
            notify();
        }
    }
    //消费商品：
    public synchronized void getProduct(){
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("消费者消费了：" + this.getBrand() + "---" + this.getName());

        flag=false;
        notify();
    }


}
