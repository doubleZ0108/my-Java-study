package Reflect.Service;

import java.util.Date;

/* 在服务器上创建HelloServiceImp实现该接口 */
public class HelloServiceImp implements HelloService{
    @Override
    public String echo(String msg) {
        return "echo:" + msg;
    }

    @Override
    public Date getTime() {
        return new Date();
    }
}