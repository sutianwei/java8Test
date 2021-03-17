package leetcode;

import java.util.Scanner;

public class 合法IP {

    /**
     * 现在IPV4下用一个32位无符号整数来表示，一般用点分方式来显示，点将IP地址分成4个部分，每个部分为8位，表示成一个无符号整数（因此不需要用正号出现），如10.137.17.1，是我们非常熟悉的IP地址，一个IP地址串中没有空格出现（因为要表示成一个32数字）。
     *
     * 现在需要你用程序来判断IP是否合法。
     *
     * 注意本题有多组样例输入。
     */
    public static void main(String[] args) {
        //input
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext())
        {
            String str=sc.next();
            //单个数字作为一个对象10.138.15.1  10   138  15 1
            String [] array=str.split("\\.");
            int count=0;
            for(int i=0;i<array.length;i++)
            {
                int p=Integer.parseInt(array[i]);
                if(p>=0&&p<=255)
                {
                    count+=1;
                }
            }
            if(count==4)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }

    }
}
