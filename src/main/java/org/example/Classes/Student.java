package org.example.Classes;

public class Student {
    // attribute
    // student.id
    private int id;
    private String name;
    private double score;

    public Student(int id, String name, double score) {
        this.id = id;
        this.name = name;
        this.score = score;
    }

    // Method (Behavior)
    public void greet(Student someone) {
        System.out.println(name + " hello! " + someone.name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Setter & Getter
    public int getId(){
        return this.id  ;
    }

    public void setId(int id){
        this.id = id;
    }
}
