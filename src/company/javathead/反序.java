package company.javathead;

import java.util.Arrays;

public class 反序 {
    public static void main(String args[]) {
        //int arr[] = new int[]{123, 45, 23, 545, 55, 452, 234234};
        String[] st = {"dsf", "sdfds", "ff"};
        System.out.println("sort排序后");
        Arrays.sort(st);
        System.out.println(Arrays.toString(st) + "  ");
        System.out.println("反转hou");
        for (int j = 0; j < st.length / 2; j++) {
            String temp = st[j];
            st[j] = st[st.length - 1 - j];
            st[st.length - 1 - j] = temp;
        }
        System.out.println(Arrays.toString(st));
    }
}
