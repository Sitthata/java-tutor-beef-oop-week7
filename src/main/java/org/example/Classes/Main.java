package org.example.Classes;

public class Main {
    public static void main(String[] args) {
        testDroid();
    }

    public static void testDroid() {
        
    }

    public static void testPerson() {
        Student student1 = new Student(1, "First", 40.0);
        Student student2 = new Student(2, "Beef", 100.0);

        System.out.println(student1.getName());
        System.out.println(student2.getName());

        System.out.println(student1.getName());
        System.out.println(student1.getId());
        System.out.println(student1.getId());
    }
}
