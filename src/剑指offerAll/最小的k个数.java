package 剑指offerAll;

import java.util.*;

public class 最小的k个数 {
    public int[] getLeastNumbers(int[] arr, int k) {
        Arrays.sort(arr);
        int b[] = new int[k];
        for (int i = 0; i < k; i++) {
            b[i] = arr[i];
        }
        return b;
    }

    public int[] getLeastNumbers2(int[] arr, int k) {
        int[] vec = new int[k];
        if (k == 0) { // 排除 0 的情况
            return vec;
        }
//        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
//            public int compare(Integer num1, Integer num2) {
//                return num2 - num1;
//            }
//        });
        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < k; ++i) {
            //在优先队列中放入K个数
            queue.offer(arr[i]);
        }
        for (int i = k; i < arr.length; ++i) {
            //peek获取队首，从k开始，小于队列中最小值的都进去，大于的直接跳过
            if (queue.peek() > arr[i]) {
                //poll获取队首，并且删除队首
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        for (int i = 0; i < k; ++i) {
            vec[i] = queue.poll();
        }
        return vec;
    }

}
