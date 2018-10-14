package org.anngudin.laba3.Auto.Car;

import org.anngudin.laba3.Auto.Object.Object;
import org.anngudin.laba3.Auto.Auto;

public abstract class Car implements Object, Auto {
    protected String mark;
    protected String motorType;
    protected int mass;
    protected int enginePower;
    protected int mileage; // пробег в км
    protected int fuel; // расход топлива
    protected int time; // время разгова в сек

  //  public Car();

    public String getMark() {
        return mark;
    }

    public String getMotorType() {
        return motorType;
    }

    public int getMass() {
        return mass;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getMileage() {
        return mileage;
    }

    protected int getFuel() {
        return fuel;
    }

    protected int getTime() {
        return time;
    }
    public void print() {
        System.out.println("\n");
    } 

    public void show() {
        System.out.println("Mark: " + getMark() + "\nMotor type: " + getMotorType() + "\nMass: " + getMass()
                + "\nEngine Power: " + getEnginePower() + "\nMileage: " + getMileage() + "\nFuel: " + getFuel()
                + "\nTime: " + getTime());
    }
}
