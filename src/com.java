import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class com {

    public static void main(String[] args) {
        student a = new student(1,"001","a",90.1f);
        student b = new student(2,"002","b",10.1f);
        student c = new student(3,"003","c",20.1f);
        student d = new student(4,"004","d",50.1f);
        student e = new student(5,"005","e",70.1f);

        List<student> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);
        list.add(e);
        System.out.println(list);

    }
}
