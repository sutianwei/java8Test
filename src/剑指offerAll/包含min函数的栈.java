package 剑指offerAll;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class 包含min函数的栈 {
    /**
     * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，
     * 调用 min、push 及 pop 的时间复杂度都是 O(1)。
     */
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        lock.lock();
        try {

        } finally {
            lock.unlock();
        }
    }

}
