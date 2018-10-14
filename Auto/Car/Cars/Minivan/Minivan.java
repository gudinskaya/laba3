package org.anngudin.laba3.Auto.Car.Cars.Minivan;

import org.anngudin.laba3.Auto.Object.Object;
import org.anngudin.laba3.Auto.Auto;
import org.anngudin.laba3.Auto.Car.Car;

public class Minivan extends Car {
    public Minivan(String mark, String motorType, int mass, int enginePower, int mileage, int fuel, int time) {
        this.mark = mark;
        this.motorType = motorType;
        this.mass = mass;
        this.enginePower = enginePower;
        this.mileage = mileage;
        this.fuel = fuel;
        this.time = time;
    }

    public void print() {
        System.out.println("\n///Minivan///");
    }
}
