package 剑指offerAll;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

public class 最长公共前缀 {

    int a = 0;
    ReentrantLock lock = new ReentrantLock();
    

    public void writer() {
        lock.lock(); //获取锁
        try {
            a++;
        } finally {
            lock.unlock(); //释放锁
        }
    }

    public void reader() {
        lock.lock();
        try {
            int i = a;
        } finally {
            lock.unlock();
        }
    }
}
