//package com.su.com.Executor;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class Student {
//    int age;
//    String username;
//    String code;
//
//    public Student(int age) {
//        this.age = age;
//    }
//
//    public Student(int age, String username, String code) {
//        this.age = age;
//        this.username = username;
//        this.code = code;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getCode() {
//        return code;
//    }
//
//    public void setCode(String code) {
//        this.code = code;
//    }
//
//    public static void main(String[] args) {
//        Student student1 = new Student(200, "yangtao", "1");
//        Student student2 = new Student(220, "yangtao2", "1");
//        Student student3 = new Student(500, "yangtao3", "2");
//        Student student4 = new Student(504, "yangtao4", "2");
//        List<Student> studentList =new ArrayList<Student>();
//        studentList.add(student1);
//        studentList.add(student2);
//        studentList.add(student3);
//        studentList.add(student4);
//        Map<String, Map<String, List<Student>>> group = studentList .stream()
//                .collect(Collectors.groupingBy(Student::getUsername, Collectors.groupingBy(Student::getCode)));
//       group.forEach((k,v)->{
//           System.out.println(k);
//           v.forEach(p->{
//               System.out.println();
//           });
//
//       });
//        System.out.println(group);
//
//
//    }
//    private static String fetchGroupKey(Student student){
//        return student.getUsername() +"+"+ student.getCode();
//    }
//}
