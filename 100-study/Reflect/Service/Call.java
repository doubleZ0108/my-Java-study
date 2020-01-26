package Reflect.Service;

import java.io.Serializable;

/**
 * 客户端调用服务端HelloServiceImp的两个方法
 *
 * 客户端把调用的方法名、方法参数类型、方法参数值、方法所属的类名送给服务器端
 * 服务器端调用相关对象的方法
 * 再把方法的返回值发送给客户端
 */
public class Call implements Serializable {
    private String className;       //类名
    private String methodName;      //方法名
    private Class[] paramTypes;     //参数类型
    private Object[] params;        //参数

    private Object result;      //方法的执行结果(返回值 | 异常)

    public Call() {
    }

    public Call(String className, String methodName, Class[] paramTypes, Object[] params) {
        this.className = className;
        this.methodName = methodName;
        this.paramTypes = paramTypes;
        this.params = params;
        this.result = result;
    }

    @Override
    public String toString() {
        return "Call{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                '}';
    }

    public String getClassName() {
        return className;
    }

    public String getMethodName() {
        return methodName;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    public Object[] getParams() {
        return params;
    }

    public Object getResult() {
        return result;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public void setParamTypes(Class[] paramTypes) {
        this.paramTypes = paramTypes;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
