package 设计模式.单例模式.er汉式;

/**
 * @author zhang
 */
public class Singleton {
    private static final Singleton  singleton= new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return singleton;
    }
}
