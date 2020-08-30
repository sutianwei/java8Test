package company.javathead;

import java.util.Scanner;

public class F1 {
    public static void turn(String s) {
        String split[] = s.split(" ");
        for (int i = 0; i < split.length; i++) {
            String s1 = split[i].substring(0, 1).toUpperCase() + split[i].substring(1);
            System.out.println(s1+"");
        }
    }
    public   static   void  main(String  args[]){
        Scanner   in=new Scanner(System.in);
        String  s=in.nextLine();
        turn(s);
    }
}
