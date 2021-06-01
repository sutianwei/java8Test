import java.util.*;

public class com {

    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<String>();
        list.add("111");
        list.add("222");
        list.add(0,"333");
        list.addFirst("000");
        list.addLast("444");
        LinkedList<String> list2=new LinkedList<String>(list);
        LinkedList<String> list3=new LinkedList<String>();
        list3.addAll(list2);
        System.out.println(list);
        System.out.println(list2);
        System.out.println(list3);

    }
}
