package company.s5_7;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class collection {
    public static void main(String args[]) {
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new LinkedHashSet<>()));
        System.out.println(fill(new HashMap<String, String>()));
        System.out.println(fill(new TreeMap<>()));
        System.out.println(fill(new LinkedHashMap<>()));
        System.out.println(fill(new Hashtable<>()));
        System.out.println(fill(new ConcurrentHashMap<>()));

    }

    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "fdhjsjf");
        map.put("cat", "sd");
        map.put("dog", "sdasdasdad");
        map.put("dog", "ssdsdsdqweqee2ed");
        return map;
    }


}
