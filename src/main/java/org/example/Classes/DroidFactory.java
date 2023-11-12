package org.example.Classes;

import java.util.ArrayList;
import java.util.List;

public class DroidFactory {
    // Create a Droid Factory
    private List<Droid> factory;

    // We need somewhere to store our droids let's create a Warehouse first

    // Constructor
    public DroidFactory() {
        factory = new ArrayList<>();
    }

    // makeDroid()
    public void makeDroid(String name) {
        Droid d1 = new Droid(name);
        System.out.println(d1);
        factory.add(d1);
    }

    public List<Droid> getFactory() {
        return factory;
    }

    // listDroids()
    public void listDroids() {
        for (int i = 0; i < factory.size(); i++) {
            System.out.println(i + " : " + factory.get(i));
        }
    }
}
