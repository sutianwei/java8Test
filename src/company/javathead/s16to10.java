package company.javathead;

import java.util.Scanner;

public class s16to10 {
    public    static   void   main(String  args[]){
        Scanner  in=new Scanner(System.in);
        String x=in.next();
        int n;
        try {
            n=Integer.parseInt(x,22);
            System.out.println(n);
        }catch (Exception  e){
            e.printStackTrace();
        }
    }
}
