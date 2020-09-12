package java编程思想;


import company.company.A;

import java.util.ArrayList;
import java.util.Collection;

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }

}

class orange {

}
class gala extends Apple{}
class fuji extends Apple{}


public class AppleOrange {
    @SuppressWarnings("unchecked")
    public static void main(String args[]) {

//        ArrayList apples = new ArrayList();
//        for (int i = 0; i < 3; i++)
//            apples.addAll((Collection) new Apple());
//        apples.add(new orange());
//        for (int i = 0; i < apples.size(); i++)
//
//            ((Apple) apples.get(i)).id();
        ArrayList<Apple>  appless=new ArrayList<>();
        appless.add(new gala());
        appless.add(new fuji());
        for (Apple d :appless){
            System.out.println(d);
        }

        //
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++)
            apples.add(new Apple());
        for (int i = 0; i < 3; i++)
            System.out.println(apples.get(i).id());
        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }


}
