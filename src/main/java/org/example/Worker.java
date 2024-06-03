package org.example;

import java.util.List;

public class Worker {
    private String name;
    private int age;
    private List<Tasks> tasks;

    // Constructors
    public Worker() {}

    public Worker(String name, int age, List<Tasks> tasks) {
        this.name = name;
        this.age = age;
        this.tasks = tasks;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Tasks> getSubjects() {
        return tasks;
    }

    public void setSubjects(List<Tasks> tasks) {
        this.tasks = tasks;
    }
}
