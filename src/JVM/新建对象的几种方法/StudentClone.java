package JVM.新建对象的几种方法;

public class StudentClone implements Cloneable {
    private String name;
    private String nickname;

    public static void main(String[] args) {
        StudentClone studentClone = new StudentClone("333","23");
        try {
            StudentClone clone =(StudentClone) studentClone.clone();
            System.out.println(clone.getName()+ clone.getNickname());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public StudentClone() {
        super();
    }

    public StudentClone(String name, String nickname) {
        super();
        this.name = name;
        this.nickname = nickname;
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
