import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @title: test09
 * @Author lijing
 * @Date: 2022/3/23 15:05
 * @Version 1.0
 * @description:线程的第三中创建方法：实现Callable接口
 */
public class test09 implements Callable<Integer> {
    public Integer call() throws Exception {
        return new Random().nextInt(10);
    }
}




class Test{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        test09 t=new test09();
        FutureTask ft=new FutureTask(t);
        Thread tr=new Thread(ft);
        tr.start();

        Object obj = ft.get();
        System.out.println(obj);
    }
}
