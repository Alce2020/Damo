/**
 * @title: test02
 * @Author lijing
 * @Date: 2022/3/23 10:24
 * @Version 1.0
 * @description:
 */
public class test02 extends Thread {
    public test02(String name){
        super(name);
    }


    @Override
    public void run() { //线程执行的任务，必须写在run方法中
        for (int i = 1; i <10 ; i++) {
            System.out.println(this.getName()+i);//得到线程名
        }
    }
}
