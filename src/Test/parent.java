package Test;

/**
 * @author zhang
 * @title: parent
 * @projectName Leetcode-
 * @description: TODO
 * @date 2021/8/10 10:55
 */
public class parent {
    public parent(){
        System.out.println("parent before");
        call();
        System.out.println("parent after");
    }
    public void call(){
        System.out.println("parent call");
    }

    public static void main(String[] args) {
        new Son(1);
    }
}
class Son extends parent{
    public int i = 2;
    public Son(){
        System.out.println("parent before");
        call();
        System.out.println("parent after");
    }
    public Son(int i1){
        System.out.println("parent before1");
        call();
        System.out.println("parent after");
    }
    @Override
    public void call(){
        System.out.println("parent call"+i);
    }
}
