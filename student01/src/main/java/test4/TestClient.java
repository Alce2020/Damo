package test4;

import java.io.*;
import java.net.Socket;

/**
 * @title: TestClient
 * @Author lijing
 * @Date: 2022/3/25 15:52
 * @Version 1.0
 * @description:客户端
 */
public class TestClient {
    public static void main(String[] args) throws IOException {
    // 1.创建套接字
        Socket s=new Socket("192.168.194.1",8888);

        OutputStream os=s.getOutputStream();//输出流
        DataOutputStream dos=new DataOutputStream(os);//处理流

        dos.writeUTF("你好");

        InputStream is=s.getInputStream();
        DataInputStream dis=new DataInputStream(is);
        String str=dis.readUTF();
        System.out.println("服务器端对我说："+str);

        dis.close();
        is.close();
        dos.close();
        os.close();
        s.close();
    }
}
