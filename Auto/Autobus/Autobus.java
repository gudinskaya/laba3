package org.anngudin.laba3.Auto.Autobus;

import org.anngudin.laba3.Auto.Object.Object;
import org.anngudin.laba3.Auto.Auto;

public class Autobus implements Object, Auto {
    protected String mark;
    protected String motorType;
    protected int mass;
    protected int enginePower;
    protected int mileage; // пробег в км
    protected int fuel; // расход топлива
    protected int time; // время разгова в сек
    protected int seats;

    public Autobus(String mark, String motorType, int mass, int enginePower, int mileage, int fuel, int time,
            int seats) {
        this.mark = mark;
        this.motorType = motorType;
        this.mass = mass;
        this.enginePower = enginePower;
        this.mileage = mileage;
        this.fuel = fuel;
        this.time = time;
        this.seats = seats;

    }
   
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

     protected int getSeats() {
        return seats;
    }

public void print() {
    System.out.println("\n///Autobus///");
}
    public void show() {
        System.out.println("Mark: " + getMark() + "\nMotor type: " + getMotorType() + "\nMass: " + getMass()
                + "\nEngine Power: " + getEnginePower() + "\nMileage: " + getMileage() + "\nFuel: " + getFuel()
                + "\nTime: " + getTime() + "\nSeats: " + getSeats());
    }
   
}
