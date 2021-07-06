package 设计模式.代理模式.静态代理;

public class TransactionHandler implements UserDao{
    private UserDao target;
    public TransactionHandler(UserDao target){
        this.target = target;
    }

    @Override
    public void save() {
        System.out.println("正在开启事务");
        target.save();
        System.out.println("关闭事务");
    }

    public static void main(String[] args) {
        UserDao target = new UserDaoImpl();
        UserDao userDao = new TransactionHandler(target);
        userDao.save();
    }
}
