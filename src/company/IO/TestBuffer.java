package company.IO;

import java.awt.image.VolatileImage;
import java.nio.ByteBuffer;

/*
 * 缓冲区，在nio中负责数据的存储。
 * 数据类型的不同，缓冲区不同
 * bytebuffer
 * chars hort int
 * long
 * float
 * double
 * 用allocate获取缓冲区
 * 二
 * put   get
 *
 * 缓冲区的核心属性
 * capacity：最大容量
 * limit：界限  缓冲区中可以操作数据的大小
 * position:正在操作的数据的位置
 *
 * 非直接缓冲区：allocate方法直接分配缓冲区，建立在jvm的内存中
 * 直接缓冲区：allocateDirect  分配直接缓冲区，建立在物理内训
 * */
public class TestBuffer {

    public static void test1() {
        String str = "abcde";
        //分配容量发
        ByteBuffer buf = ByteBuffer.allocate(1024);
        System.out.println("---------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        buf.put(str.getBytes());
        System.out.println("---------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        buf.flip();
        System.out.println("---------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());
        //读取
        byte[] dst = new byte[buf.limit()];
        buf.get(dst);
        System.out.println(new String(dst, 0, dst.length));
        System.out.println("---------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        buf.rewind();//可重复度
        System.out.println("---------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        //clear
        buf.clear();
        System.out.println("---------------");
        System.out.println(buf.position());
        System.out.println(buf.limit());
        System.out.println(buf.capacity());

        System.out.println((char) buf.get());

    }

    public static void test2() {
        String str = "asdsfg";
        ByteBuffer buf = ByteBuffer.allocate(1024);

        buf.put(str.getBytes());
        buf.flip();
        byte[] dst = new byte[buf.limit()];
        buf.get(dst, 2, 2);
        System.out.println(new String(dst, 0, 2));
        System.out.println(buf.position());


        buf.mark();
        buf.get(dst, 2, 2);
        System.out.println(new String(dst, 2, 2));
        System.out.println(buf.position());


    }

    public static void main(String args[]) {
        test1();
        test2();
    }
}
