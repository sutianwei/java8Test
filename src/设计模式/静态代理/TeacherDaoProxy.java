package 设计模式.静态代理;

//静态代理对象
public class TeacherDaoProxy implements ITeacherDao {

    private ITeacherDao target;

    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }

    @Override
    public void tech() {
        System.out.println("代理对象开始  完成某些操作-----");

        target.tech();

        System.out.println("提交");
    }
}
