package 设计模式.单例模式.枚举;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public enum Singleton {
    INSTANCE;
    private Singleton(){
        System.out.println("枚举类创建对象了初始化");
    }
    public void doSomethings(){
        System.out.println("这是枚举类型的单例模式");
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Singleton t1 = Singleton.INSTANCE;
        Singleton t2 = Singleton.INSTANCE;
        System.out.println(t1 == t2);
        //测试通过注解进行破坏其单例特性
//        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Singleton singleton1 = constructor.newInstance();
//        Singleton singleton2 = constructor.newInstance();
//        System.out.println(singleton1==singleton2);
    }
}
