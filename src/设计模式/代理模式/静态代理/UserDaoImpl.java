package 设计模式.代理模式.静态代理;

public class UserDaoImpl implements UserDao{
    @Override
    public void save() {
        System.out.println("正在保存用户");
    }
}
