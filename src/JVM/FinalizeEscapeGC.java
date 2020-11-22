package JVM;

import jdk.nashorn.internal.objects.NativeUint8Array;

public class FinalizeEscapeGC {


    public static FinalizeEscapeGC SAVE_HOME = null;

    public void isAlive() {
        System.out.println("i am alive");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize method executed");
        FinalizeEscapeGC.SAVE_HOME = this;
    }

    public static void main(String[] args) throws InterruptedException {
        SAVE_HOME = new FinalizeEscapeGC();

        //对象第一次拯救自己
        SAVE_HOME = null;
        System.gc();
        Thread.sleep(500);

        if (SAVE_HOME != null) {
            SAVE_HOME.isAlive();
        } else {
            System.out.println("i am dead");
        }

//这次自救失败
        SAVE_HOME = null;
        System.gc();
        Thread.sleep(500);

        if (SAVE_HOME != null) {
            SAVE_HOME.isAlive();
        } else {
            System.out.println("i am dead");
        }


    }
}
