/**
 * @title: test03
 * @Author lijing
 * @Date: 2022/3/23 10:27
 * @Version 1.0
 * @description:
 */
public class test03 {
    public static void main(String[] args) {
        Thread.currentThread().setName("主线程:");//获取当前正在执行的线程

        test02 t = new test02("子线程");//不能直接调用run方法，直接调用run（）为普通方法
        // t.setName("子线程:");
        t.start();//启动线程

        for (int i = 1; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+i);
        }
    }
}
