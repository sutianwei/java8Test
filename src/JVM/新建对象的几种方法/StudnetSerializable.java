package JVM.新建对象的几种方法;

import java.io.*;

public class StudnetSerializable implements Serializable {

    private static final long serialVersionUID = 7313908511206187571L;

    private String name;
    private String nickname;


    public static void main(String[] args) {
        String filePath = "data.txt";
        Student student1 = new Student("Deserialization", "反序列化");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
            outputStream.writeObject(student1);
            outputStream.flush();
            outputStream.close();

            FileInputStream fileInputStream = new FileInputStream(filePath);
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            StudnetSerializable student2 = (StudnetSerializable) inputStream.readObject();

            inputStream.close();

            System.out.println("Student name:"+student2.getName()+", nickname:"+student2.getNickname());
        } catch (Exception ee) {
            ee.printStackTrace();
        }
    }
    public StudnetSerializable() {
        super();
    }

    public StudnetSerializable(String name, String nickname) {
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
