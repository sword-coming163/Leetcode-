package 设计模式.单例模式.懒汉式;

import javax.xml.crypto.dsig.SignedInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Singleton {
    //懒汉式+双重检查
    private static volatile Singleton singleton;
    private Singleton(){};
    public static Singleton getInstance(){
        if (singleton==null){
            synchronized (Singleton.class){
                if (singleton==null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //测试通过注解进行破坏其单例特性
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton singleton1 = constructor.newInstance();
        Singleton singleton2 = constructor.newInstance();
        System.out.println(singleton1==singleton2);
    }
}
