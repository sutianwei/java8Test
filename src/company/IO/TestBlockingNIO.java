package company.IO;

import company.offer.Server;
//import org.junit.Test;


import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

/*
 * 使用nio完成网络通信
 * 1通道:l连接
 * 2：缓冲区：存储数据
 * 3:选择器：selector Slectablechannel的多路复用器。监控Slectablechannel的多路复用器的IOh状况
 * SelectableChannel
 * SocketChannel
 * ServerSocketChannel
 * DatagramChannel
 *
 *
 *
 *
 * */
public class TestBlockingNIO {

    public void client() throws Exception {
        //获取通道
        SocketChannel sChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 9898));
        FileChannel inChannel = FileChannel.open(Paths.get("1.jpg"), StandardOpenOption.READ);
        //分配制定大小的缓冲区
        ByteBuffer buf = ByteBuffer.allocate(1024);
        //读取本地文件，发送到服务端
        while (inChannel.read(buf) != -1) {
            buf.flip();
            sChannel.write(buf);
            buf.clear();
        }
        inChannel.close();
        sChannel.close();

    }

//    @Test
    public void server() throws Exception {
        ServerSocketChannel ssChannel = ServerSocketChannel.open();
        FileChannel outChannel = FileChannel.open(Paths.get("2.jpg"), StandardOpenOption.WRITE, StandardOpenOption.CREATE);
        //绑定连接
        ssChannel.bind(new InetSocketAddress(9898));
        //获取连接客户端的通道
        SocketChannel sChannel = ssChannel.accept();
        //缓存粗
        ByteBuffer buf = ByteBuffer.allocate(1024);
        //接受客户端   保存到本地
        while (sChannel.read(buf) != -1) {
            buf.flip();
            outChannel.write(buf);
            buf.clear();
        }
        sChannel.close();

    }

}
