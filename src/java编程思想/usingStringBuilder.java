package java编程思想;

import java.util.Random;

public class usingStringBuilder {
    public static Random rand=new Random(47);

    public String toString(){
        StringBuilder result=new StringBuilder("[");

        for (int i=0;i<25;i++){
            /**
             *   public StringBuilder append(int i) {
             *         super.append(i);
             *         return this;
             *     }
             */
            result.append(rand.nextInt(100));
            result.append(",");
        }
        /**
         *   public StringBuilder delete(int start, int end) {
         *         super.delete(start, end);
         *         return this;
         *     }
         */
        result.delete(result.length()-2,result.length());
        result.append("]");
        return  result.toString();
    }
    public static void main(String[] args){
        usingStringBuilder  usingStringBuilder=new usingStringBuilder();
        System.out.println(usingStringBuilder);


        String a =new String("abc");
        String b =new String("abc");

        String c="abc";
        String d="abc";

        System.out.println(a==b+"a------------b");//false
        System.out.println(" -----"+a.equals(b)+"------a equsla b--------------");//true
        System.out.println(" -----"+c==d+"-----c----------------------d");//false
        System.out.println(" -----"+c.equals(d)+"-c  equals ----------------d");//true
        System.out.println(" -----"+a==c+"--------a--------------------c");//false
        System.out.println(a.equals(c)+"---------a--++++++++++++++++++++c");//true


    }

}
