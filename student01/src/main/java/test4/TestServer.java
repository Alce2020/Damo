package test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @title: TestServer
 * @Author lijing
 * @Date: 2022/3/25 16:00
 * @Version 1.0
 * @description:服务器
 */
public class TestServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(8888);
        Socket s = ss.accept();

        InputStream is = s.getInputStream();
        DataInputStream dis=new DataInputStream(is);

        String str=dis.readUTF();
        System.out.println("客户端发来的数据："+str);

        OutputStream os=s.getOutputStream();
        DataOutputStream dos= new DataOutputStream(os);
        dos.writeUTF("你好，我是服务器端，我接受到你的请求了！");

        dos.close();
        os.close();
        dis.close();
        is.close();
        s.close();
        ss.close();

    }
}
