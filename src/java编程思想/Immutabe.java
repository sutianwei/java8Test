package java编程思想;

public class Immutabe {
    public static String updase(String s){
        return  s.toUpperCase();
    }
    public static void main(String args[]){
//        String q="howdy";
//        System.out.println(q);
//        String qq=updase(q);
//        System.out.println(qq);
//        System.out.println(q);

        String mongo ="mongo";
        String s="abc"+mongo+"666";
        System.out.println(s);
    }
}
