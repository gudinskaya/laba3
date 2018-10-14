package org.anngudin.laba3.Auto.Car.Cars.Pickup;

import org.anngudin.laba3.Auto.Object.Object;
import org.anngudin.laba3.Auto.Auto;
import org.anngudin.laba3.Auto.Car.Car;

public class Pickup extends Car {
    public Pickup(String mark, String motorType, int mass, int enginePower, int mileage, int fuel, int time) {
        this.mark = mark;
        this.motorType = motorType;
        this.mass = mass;
        this.enginePower = enginePower;
        this.mileage = mileage;
        this.fuel = fuel;
        this.time = time;
    }

    public void print() {
        System.out.println("\n///Pickup///");
    }
}
