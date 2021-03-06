package JVM.类加载机制;


/***
 * 被动引用
 * 通过子类引用父类的静态字段，不会导致子类初始化
 */

public class SuperClass {

    static {
        System.out.println("SuperClass  init");
    }

    public static int value = 123;

}
 class SubClass extends SuperClass {
    static {
        System.out.println("subclass init");
    }
}

 class Not{
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}


