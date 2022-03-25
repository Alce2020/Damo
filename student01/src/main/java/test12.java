import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @title: test12
 * @Author lijing
 * @Date: 2022/3/23 16:57
 * @Version 1.0
 * @description:sleep练习：秒表
 */
public class test12 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("hh:mm:ss");
        while (true) {
            Date d = new Date();
            System.out.println(df.format(d));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
