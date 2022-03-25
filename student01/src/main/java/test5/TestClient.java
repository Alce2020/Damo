package test5;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @title: TestClient
 * @Author lijing
 * @Date: 2022/3/25 15:52
 * @Version 1.0
 * @description:客户端
 */
public class TestClient {
    public static void main(String[] args){
    // 1.创建套接字
        Socket s= null;
        OutputStream os =null;
        ObjectOutputStream oos=null;
        InputStream is=null;
        DataInputStream dis=null;
        try {
            s = new Socket("192.168.194.1",8888);
            Scanner sc=new Scanner(System.in);
            System.out.println("请录入您的账号哦：");
            String name=sc.next();
            System.out.println("请录入您的密码哦：");
            String pwd=sc.next();

            User user=new User(name,pwd);

            // 输出
            os=s.getOutputStream();//输出流
            oos=new ObjectOutputStream(os);
            oos.writeObject(user);

            // 输入
            is=s.getInputStream();
            dis=new DataInputStream(is);
            boolean b = dis.readBoolean();
            if (b){
                System.out.println("恭喜，登陆成功");
            }else {
                System.out.println("对不起，登陆失败");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(dis!=null){
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is!=null){
                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (oos!=null){
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os!=null) {
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (s!=null){
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }
}
