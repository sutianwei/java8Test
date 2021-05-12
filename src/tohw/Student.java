package tohw;

public class Student implements Cloneable{

    private String name = "instance";

    public Student() {
        super();
    }
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Student student = new Student("su");


        System.out.println("new 对象"+student.getName());
        try {
            Student clone =(Student) student.clone();
            System.out.println("clone 对象"+clone.getName());
        }catch (Exception e){
            e.printStackTrace();
        }


        try {
            String classStu  = "tohw.Student";
            Class clzz = Class.forName(classStu);
            Student result = (Student)clzz.newInstance();
            System.out.println("反射对象"+result.getName());

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

    }





}
