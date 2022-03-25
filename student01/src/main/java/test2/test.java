package test2;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @title: test
 * @Author lijing
 * @Date: 2022/3/25 10:52
 * @Version 1.0
 * @description:封装ip
 */
public class test {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ia =InetAddress.getByName("localhost");
        System.out.println(ia);
        InetAddress ia1 = InetAddress.getByName("DESKTOP-3NUGLSJ");
        System.out.println(ia1);
        System.out.println(ia1.getHostAddress());
        System.out.println(ia1.getHostName());
    }
}
