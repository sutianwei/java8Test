package myown;

import java.util.*;
import java.util.stream.Collectors;

public class random {

    public static void main(String[] args) {
        Random r = new Random();
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < 100; i++) {
            list.add(r.nextInt(33)+1);
            if (list.size() == 6){
                break;
            }
        }
        List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
        System.out.println(collect);
    }

}
