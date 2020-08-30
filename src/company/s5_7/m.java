package company.s5_7;

/**
 * @Author: sutianwei
 * @Date: 2019/5/7 0:54
 */
public class m {
    public static void main(String[] args) {
        Other o = new Other();
        new m().addOne(o);
        System.out.println(o.i);
    }
    public void addOne(final Other o) {
        o.i++;
    }
}

class Other {
    public int i;
}
