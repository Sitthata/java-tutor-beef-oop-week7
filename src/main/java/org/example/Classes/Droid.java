package org.example.Classes;

public class Droid {
    // Let's create your own droid!
    /*
     *  Droid should have the following instance fields:
     * 1. name
     * 2. batteryLevel = 100
     */
    private String name;
    private int batteryLevel;

    // Constructor
    public Droid(String name) {
        this.name = name;
        this.batteryLevel = 100;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    // Methods
    // performTask(String task)
    public void performTask(String task) {
        if (batteryLevel !=0 && batteryLevel > 0) {
            System.out.println(name + task);
            batteryLevel -= 20;
            return;
        }
        System.out.println("battery 0 Cody is running out of battery");
    }

    // d1.performTask("grocery")
    // Cody is performing grocery -= 20
    // battery 0 Cody is running out of battery


    // chargeBattery()

    // droidInfo()
}