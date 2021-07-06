package 设计模式.代理模式.动态代理.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("------插入前置通知代码-------------");
        // 执行相应的目标方法
        Object rs = method.invoke(target,args);
        System.out.println("------插入后置处理代码-------------");
        return rs;
    }

    public static void main(String[] args) {
        IHello iHello = (IHello) Proxy.newProxyInstance(IHello.class.getClassLoader(),new Class[]{IHello.class},new MyInvocationHandler(new HelloImpl()));
        iHello.sayHello();
    }
}
