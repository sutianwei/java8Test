package java编程思想;

class Letter{
    char c;
}

public class PassObject {
    static void f(Letter y){
        y.c = 'z';
    }

    public static void main(String args[]){
        Letter x=new Letter();
        x.c = 'a';
        System.out.println(x.c);//a
        f(x);
        System.out.println(x.c);//z
    }

}
