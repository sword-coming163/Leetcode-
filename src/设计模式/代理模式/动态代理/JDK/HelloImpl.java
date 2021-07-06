package 设计模式.代理模式.动态代理.JDK;

public class HelloImpl implements IHello{
    @Override
    public void sayHello() {
        System.out.println("Hello World");
    }
}
