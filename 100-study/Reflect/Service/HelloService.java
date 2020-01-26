package Reflect.Service;

import java.util.Date;

/* 假设在服务端有一个HelloService接口 */
public interface HelloService{
    public String echo(String msg);

    public Date getTime();
}
