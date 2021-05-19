package com.su.com;

import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private double score;
    private int age;
    private int index;


    public Student(String name, double score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}


class TestDemo {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Jack", 52, 10),
                new Student("Amdy", 79.5, 10),
                new Student("Lucy", 68, 9),
                new Student("Tom", 79.5, 11),
                new Student("Jerry", 52, 8),
                new Student("Cherry", 79.5, 10),
                new Student("Sweet", 91, 12),
                new Student("Lucky", 68, 9),
                new Student("Sim", 79.5, 10),
                new Student("Solem", 65, 10)
        );
        // fun1(students);
        // System.out.println("---------------分割线---------------------");
        // fun2(students);
        // System.out.println("---------------分割线---------------------");
        // fun3(students);
        // System.out.println("---------------分割线---------------------");
        fun1(students);

    }


    public static void fun1(List<Student> students) {
        students.sort((s1, s2) -> -Double.compare(s1.getScore(), s2.getScore()));
        int index = 0;
        double lastScore = -1;

        for (Student s : students) {
            if (Double.compare(lastScore, s.getScore()) != 0) {
                lastScore = s.getScore();
                index++;
            }
            System.out.println("名次:" + index + "\t分数" + s.getScore() + "\t名字" + s.getName());
        }


    }
}