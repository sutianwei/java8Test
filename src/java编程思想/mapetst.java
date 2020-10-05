package java编程思想;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapetst {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("zhang1", 2);
        map.put("zhang2", 4);
        map.put("zhang3", 7);
        map.put("zhang4", 33);
        map.put("zhang5", 6);


        map.forEach((key,value)-> System.out.println(key+":::::::::::::"+value));
//        show(map);
//        show1(map);
//        show2(map);
//        show3(map);
//        System.out.println(map);

    }

    /*map.foreach*/



    /**Iterator遍历*/
    public static void show3(Map<String, Integer> map) {
        Long start=System.currentTimeMillis();
        Iterator<Map.Entry<String,Integer>> it=map.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer>  entry= it.next();
            System.out.println(entry);
        }
        Long end=System.currentTimeMillis();
        System.out.println(end-start+"2=====");
    }


    //entryset遍历

    public static void show2(Map<String, Integer> map) {
        for (Map.Entry<String,Integer> entry: map.entrySet()) {
            System.out.println("@@@@@@"+entry + "-------" );
            System.out.println(entry.getKey()+"++++++++++++"+entry.getValue());
        }
    }

    //values遍历
    public static void show1(Map<String, Integer> map) {
        for (Integer v : map.values()) {
            System.out.println(v + "-------" );
        }
    }


    /*map的ketset遍历*/
    public static void show(Map<String, Integer> map) {
        for (String key : map.keySet()) {
            System.out.println(key + "-------" + map.get(key));
        }
    }

    public static Map input() {
        Map<String, Integer> map = new HashMap<>();
        map.put("zhang1", 2);
        map.put("zhang2", 4);
        map.put("zhang3", 7);
        map.put("zhang4", 33);
        map.put("zhang5", 6);
        return map;
    }
}
