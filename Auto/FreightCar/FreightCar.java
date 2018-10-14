package org.anngudin.laba3.Auto.FreightCar;

import org.anngudin.laba3.Auto.Object.Object;
import org.anngudin.laba3.Auto.Auto;

public class FreightCar implements Object, Auto {

    protected String mark;
    protected String motorType;
    protected int mass;
    protected int enginePower;
    protected int mileage; // пробег в км
    protected int carryingCapacity; // в тоннах
    protected String carcase; // открытый. закрытый

    public FreightCar(String mark, String motorType, int mass, int enginePower, int mileage, int carryingCapacity,
            String carcase) {
        this.mark = mark;
        this.motorType = motorType;
        this.mass = mass;
        this.enginePower = enginePower;
        this.mileage = mileage;
        this.carryingCapacity = carryingCapacity;
        this.carcase = carcase;

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

    protected int getCarryingCapacity() {
        return carryingCapacity;

    }

    protected String getCarcase() {
        return carcase;
    }

    public void print() {
        System.out.println("\n///Freight Car///");
    }

    public void show() {
        System.out.println("Mark: " + getMark() + "\nMotor type: " + getMotorType() + "\nMass: " + getMass()
                + "\nEngine Power: " + getEnginePower() + "\nMileage: " + getMileage() + "\nCattying capacity: "
                + getCarryingCapacity() + "\nCarcase: " + getCarcase());
    }

}
