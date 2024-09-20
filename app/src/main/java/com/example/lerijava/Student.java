package com.example.lerijava;

public class Student {
    private int id ;
    private String name;

    public Student() {
    }

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getInfo(String nameOfTheTask){
        for(int i=0;i<100;i++){
            System.out.println(nameOfTheTask+i);
        }
    }
}
