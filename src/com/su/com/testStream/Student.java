package com.su.com.testStream;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Student {
    private String name;
    private Integer score;

    public Student(String s, int i) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }


//a
    public void init() {
        Random random = new Random();
        List<Student> stuList = new ArrayList<Student>() {
            {
                for (int i=0;i<100;i++){
                    add(new Student("studnet ++" + i,random.nextInt(50)+50));
                }
            }

        };
    }
}
