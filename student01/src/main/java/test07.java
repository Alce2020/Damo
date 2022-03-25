/**
 * @title: test07
 * @Author lijing
 * @Date: 2022/3/23 11:20
 * @Version 1.0
 * @description:
 */
public class test07 {
    public static void main(String[] args) {
        test06 t = new test06();
        Thread tt= new Thread(t,"子线程");
        tt.start();


        for (int i = 1; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+i);

        }
    }


}
