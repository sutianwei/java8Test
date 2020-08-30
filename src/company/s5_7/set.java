package company.s5_7;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String args[]) {
        Random random = new Random();
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(random.nextInt(30));
            System.out.println(set);
        }
    }
}
