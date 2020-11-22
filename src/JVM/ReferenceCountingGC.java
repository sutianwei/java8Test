package JVM;

import org.junit.Test;

public class ReferenceCountingGC {

    public Object instance = null;

    private static final int _1MB=1024*1024;

    /**为了占用点内存，方便结果查看*/
    private byte[]  bigSize=new byte[200*_1MB];


    public static void testGC(){

        ReferenceCountingGC  A = new ReferenceCountingGC();
        ReferenceCountingGC  B = new ReferenceCountingGC();
        A.instance=B;
        B.instance=A;
        
        A=null;
        B=null;

        System.gc();
    }

    public static void main(String[] args) {
        testGC();
    }


}
