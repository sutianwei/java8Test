package JVM.新建对象的几种方法;

public class Student {
    private String name;
    private String nickname;

    public static void main(String[] args) {
        //NEW 对象的方式
        Student zhangsan = new Student("zhangsan","daodao");
        Student student = new Student();
        student.setName("123");
        student.setNickname("666");
        System.out.println(zhangsan);
        System.out.println(student.getName()+student.getNickname());



        //反序列化方法

    }
    public Student(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
    }


    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
