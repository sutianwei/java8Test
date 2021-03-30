package 狂神说.线程基础;

//静态代理
//真实对象和代理都要实现同一个接口
//代理要代理真实角色
//代理对象可以做很多事情
//真实对象只做自己的事情
public class staticPROXY {

    public static void main(String[] args) {
        You you = new You();
        new Thread(()-> System.out.println("love")).start();
        new WeddingCompany(new You()).HappyMarry();

new Thread(()-> System.out.println("sds")).start();

    }




}


interface Marry {

    void HappyMarry();
}

//真是角色
class You implements Marry{

    @Override
    public void HappyMarry() {
        System.out.println("1 结婚了");
    }
}
//代理
class WeddingCompany implements Marry{

    private Marry target;

    public WeddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {
        before();
        this.target.HappyMarry();
        after();
    }

    private void before() {
        System.out.println("前，布置现场");
    }

    private void after() {
        System.out.println("后，收钱");
    }
}