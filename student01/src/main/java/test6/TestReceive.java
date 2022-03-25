package test6;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @title: TestReceive
 * @Author lijing
 * @Date: 2022/3/25 18:14
 * @Version 1.0
 * @description:接收方
 */
public class TestReceive {
    public static void main(String[] args) throws IOException {
        System.out.println("老师上线了");

        DatagramSocket ds=new DatagramSocket(9999);

        byte[] b=new byte[1024];
        DatagramPacket dp=new DatagramPacket(b,b.length);
        ds.receive(dp);

        byte[] data = dp.getData();
        String s=new String(data,0,dp.getLength());
        System.out.println("学生对我说："+s);

        ds.close();
    }
}
