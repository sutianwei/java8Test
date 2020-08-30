package company.javathead;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: sutianwei
 * @Date: 2019/5/27 18:29
 */
public class map {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "sd");
        map.put(2, "sutianwei");
        map.put(3, "df");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println(map.remove(1));
        System.out.println(map);
        System.out.println(map.replace(2,"sjsgjs"));
        System.out.println(map);
        System.out.println(map.put(4,"dsfs"));

    }
}
