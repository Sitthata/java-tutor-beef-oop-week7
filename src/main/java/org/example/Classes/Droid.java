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
    static int LEG = 2;


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
    // name + " is performing " + task
    public void performTask(String task) {
        // Check if battery is more than 0
        if (batteryLevel > 0) {
            System.out.println(name + " is performing " + task);
            batteryLevel -= 20;
        } else {
            System.out.println("error");
            batteryLevel = 0;
        }
        // Perform task
        // if battery < 0 - Error
    }

    // chargeBattery()
    public void chargeBattery() {
        batteryLevel = 100;
    }

    // droidInfo()
    public void droidInfo() {
        System.out.println(name + " : " + batteryLevel);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Droid{");
        sb.append("name='").append(name).append('\'');
        sb.append(", batteryLevel=").append(batteryLevel);
        sb.append('}');
        return sb.toString();
    }
}