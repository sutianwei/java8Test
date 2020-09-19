package company.javathead;

import java.util.*;
import java.util.List;


public class link {
    public static void main(String[] args) {
        List<String> a = new LinkedList<>();
        a.add("asd");
        a.add("sd");
        a.add("dfd");
        System.out.println("a是"+a);
        List<String> b = new LinkedList<>();
        b.add("gg");
        b.add("hjh");
        b.add("ghgh");
        System.out.println("b是"+b);
        ListIterator<String> aIterator = a.listIterator();
        Iterator<String> bIterator = b.listIterator();
        while (bIterator.hasNext()) {
            if (aIterator.hasNext())
                aIterator.next();
            aIterator.add(bIterator.next());
        }
        System.out.println(a);
        //remove
        bIterator = b.listIterator();
        while (bIterator.hasNext()) {
            bIterator.next();
            if (bIterator.hasNext()) {
                bIterator.next();
                bIterator.remove();
            }
        }
        System.out.println(b);
        a.removeAll(b);
        System.out.println(a);
    }
}
