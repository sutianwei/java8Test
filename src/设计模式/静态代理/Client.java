package 设计模式.静态代理;

public class Client {


    public static void main(String[] args) {
        //被代理对象非
        TeacherDao teacherDao = new TeacherDao();

        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);

        //执行
        teacherDaoProxy.tech();

    }

}
