package test5;

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
    public static void main(String[] args){
        ServerSocket ss= null;
        Socket s=null;
        InputStream is=null;
        ObjectInputStream ois=null;
        OutputStream os=null;
        DataOutputStream dos=null;
        try {
            ss = new ServerSocket(8888);
            s = ss.accept();

            is = s.getInputStream();
            ois=new ObjectInputStream(is);

            User user = (User) (ois.readObject());

            boolean flag=false;
            if (user.getName().equals("静静")&&user.getPwd().equals("123456")){
                flag=true;
            }

            os=s.getOutputStream();
            dos= new DataOutputStream(os);
            dos.writeBoolean(flag);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dos!=null){
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (os!=null){
                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ois!=null){
                    ois.close();
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
                if (s!=null){
                    s.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (ss!=null){
                    ss.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
