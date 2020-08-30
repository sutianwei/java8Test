package company.javathead;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @Author: sutianwei
 * @Date: 2019/5/26 0:25
 */
public class List {
    public   static   void   main(String[] args){
        Collection<String>  list=new ArrayList<>();
        list.add("a");
        list.add("b");
//        Iterator<String> it=list.iterator();
//        while (it.hasNext()){
//            String  str=it.next();
//            System.out.println(str);
//        }
        System.out.println(list);
    }
}
