package test2;

import java.net.InetAddress;
import java.net.InetSocketAddress;

/**
 * @title: testt
 * @Author lijing
 * @Date: 2022/3/25 10:59
 * @Version 1.0
 * @description:封装IP，端口号
 */
public class testt {
    public static void main(String[] args) {
        InetSocketAddress isa = new InetSocketAddress("192.168.194.1",8080);
        System.out.println(isa);
        System.out.println(isa.getHostName());
        System.out.println(isa.getPort());

        InetAddress ia = isa.getAddress();

        System.out.println(ia.getHostName());
        System.out.println(ia.getHostAddress());
    }
}
