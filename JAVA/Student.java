package org.example;

import javax.lang.model.type.NullType;

public class Student {
    private String name;
    private int id;

    public Student(String name, int id){
        this.name = name;
        this.id = id;

    }

    String getName(){
        return name;
    }

    int getId(){
        return id;
    }

    String describe(){
        return "name = "+name+", id = "+id;
    }

    void setName(String newName){
        if (newName == null || newName.trim().equals("")){
            System.out.println("Error: invalid name");

        }
        else{
            name = newName;
        }
    }


}
