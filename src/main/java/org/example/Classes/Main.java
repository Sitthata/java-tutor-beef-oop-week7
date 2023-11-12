package org.example.Classes;

public class Main {
    public static void main(String[] args) {
        testDroid();
    }

    public static void testDroid() {
        DroidFactory droidFactory = new DroidFactory();
        droidFactory.makeDroid("d1");
        droidFactory.makeDroid("d2");
        System.out.println(droidFactory.getFactory()); // factory

        System.out.println(Droid.LEG);
    }

    public static void testPerson() {
        Student student1 = new Student(1, "First", 40.0);
        Student student2 = new Student(2, "Beef", 100.0);

        student1.greet(student2);

        System.out.println(student1.getName());
        System.out.println(student2.getName());

        System.out.println(student1.getName());
        System.out.println(student1.getId());
        System.out.println(student1.getId());
    }
}
