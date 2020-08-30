package company.多线程;

public class Sysdemo2 {
    public static void main(String args[]) throws  Exception{
        Jvm jvm1 = Jvm.getInstance();
        Jvm jvm2 = Jvm.getInstance();
        System.out.println(jvm1);
        System.out.println(jvm2);
    }

    /*
     * 懒汉式
     * */
    static class Jvm {
        //构造器私有化，避免外部直接创建对象
        private static Jvm instance = null;

        private Jvm() {
        }

        public static Jvm getInstance() throws Exception {
            if (null == instance) {
                Thread.sleep(100);
                instance = new Jvm();

            }
            return instance;
        }
    }
}
