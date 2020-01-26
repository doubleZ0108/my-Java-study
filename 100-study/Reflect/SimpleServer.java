package Reflect;

import Reflect.Service.Call;
import Reflect.Service.HelloServiceImp;

import java.io.*;
import java.lang.reflect.Method;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

/**
 * 服务器端
 *
 * 收到调用请求后使用反射机制动态调用指定对象的指定方法
 * 将返回结果返回给客户端
 */
public class SimpleServer {
    private Map remoteObjects = new HashMap();   //远程对象的缓存

    //把远程对象放到缓存中
    public void register(String className, Object removeObject){
        remoteObjects.put(className, removeObject);
    }

    public void service() throws IOException, ClassNotFoundException {
        ServerSocket serverSocket = new ServerSocket(2020);
        System.out.println("服务器启动");
        while(true){
            Socket socket = serverSocket.accept();
            InputStream in = socket.getInputStream();
            ObjectInputStream ois = new ObjectInputStream(in);
            OutputStream out = socket.getOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(out);

            Call call = (Call) ois.readObject();    //接受客户端发送的Call对象
            System.out.println(call);
            call = invoke(call);    //调用相关对象的方法
            oos.writeObject(call);  //向客户发送包含了执行结果的Call对象

            ois.close();
            oos.close();
            socket.close();
        }
    }

    public Call invoke(Call call){
        Object result = null;
        try {
            String className = call.getClassName();
            String methodName = call.getMethodName();
            Object[] params = call.getParams();
            Class classType = Class.forName(className);
            Class[] paramTypes = call.getParamTypes();
            Method method = classType.getMethod(methodName, paramTypes);

            Object remoteObject = remoteObjects.get(className);     //从缓存中取出相关的远程对象
            if (remoteObject == null) {
                throw new Exception(className + "的远程对象不存在");
            }else{
                result = method.invoke(remoteObject, params);
            }
        } catch (Exception e) {
            result = e;
        }
        call.setResult(result);
        return call;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SimpleServer server = new SimpleServer();

        //把事先创造的HelloServiceImp对象加入到服务器缓存中
        server.register("doubleZ.HelloService", new HelloServiceImp());
        server.service();
    }
}
