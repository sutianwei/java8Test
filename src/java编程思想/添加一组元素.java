package java编程思想;

import java.util.*;

public class 添加一组元素 {
    public static void main(String args[]) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Integer[] moreInts = {6, 7, 8, 9, 10};
        collection.addAll(Arrays.asList(moreInts));
        System.out.println("1111======" + collection);

        Collections.addAll(collection, 34, 45, 56, 67);

        //
        List<Integer>  list=Arrays.asList(22,33,44,55,66);
        //运行时异常。list的大小定了，不可以resize
//        list.add(3);
        list.set(1,99);
        System.out.println(list);

    }
}
