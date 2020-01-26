package Reflect;

import Reflect.Service.Call;

import java.io.*;
import java.net.Socket;

/**
 * 客户端
 *
 * 建立与服务器的谅解
 * 将带有调用信息的Call对象送到服务器端
 */
public class SimpleClient {
    public void invoke() throws IOException, ClassNotFoundException {
        Socket socket = new Socket("localhost", 2020);
        OutputStream out = socket.getOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(out);
        InputStream in = socket.getInputStream();
        ObjectInputStream ois = new ObjectInputStream(in);

        //创建一个远程调用对象
        Call call = new Call("doubleZ.HelloService", "echo", new Class[]{String.class}, new Object[]{"Java"});
        oos.writeObject(call);      //向服务器发送Call对象
        call = (Call) ois.readObject(); //接受包含方法执行结果的Call对象
        System.out.println(call.getResult());

        ois.close();
        oos.close();
        socket.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        new SimpleClient().invoke();
    }
}
