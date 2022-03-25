package test6;

import java.io.IOException;
import java.net.*;

/**
 * @title: TestSend
 * @Author lijing
 * @Date: 2022/3/25 17:56
 * @Version 1.0
 * @description:发送方
 */
public class TestSend {
    public static void main(String[] args) throws IOException {
        System.out.println("学生上线");
        DatagramSocket ds=new DatagramSocket(8888);

        String str="你好";
        byte[] bytes = str.getBytes();
        /*
        需要四个参数：
        1.指的是传送数据转为字节数组
        2.字节数组的长度
        3.封装接收方的ip
        4.指定接收方的端口号
        */
        DatagramPacket dp=new DatagramPacket(bytes,bytes.length, InetAddress.getByName("localhost"),9999);

        ds.send(dp);

        ds.close();

    }

}
