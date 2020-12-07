package JVM.新建对象的几种方法;

public class StudentInstance {

    private String name = "Zhangsan";
    private String nickname = "张三";

    public StudentInstance(){
        super();
    }

    public StudentInstance(String name,String nickname){
        super();
        this.name = name;
        this.nickname = nickname;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getNickname(){
        return nickname;
    }
    public void setNickname(String nickname){
        this.nickname = nickname;
    }

    public static void main(String[] args) {
        //class.forName()
        try {
            String className = "JVM.新建对象的几种方法.StudentInstance";
            Class clz=Class.forName(className);
            StudentInstance  instance =(StudentInstance) clz.newInstance();
            System.out.println(instance.getName()+instance.getNickname());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
