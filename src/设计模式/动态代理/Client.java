package 设计模式.动态代理;

public class Client {

    public static void main(String[] args) {
        ITeacherDao teacherDao = new TeacherDao();
        ITeacherDao proxyInstance = (ITeacherDao) new ProxyFactory(teacherDao).getProxyInstance();
        System.out.println(proxyInstance.getClass());
        proxyInstance.tech();

    }
}
