package org.anngudin.laba3;
import org.anngudin.laba3.Auto.Object.Object;
import org.anngudin.laba3.Auto.Auto;
import org.anngudin.laba3.Auto.Car.Car;
import org.anngudin.laba3.Auto.Car.Cars.Minivan.Minivan;
import org.anngudin.laba3.Auto.Car.Cars.Pickup.Pickup;
import org.anngudin.laba3.Auto.FreightCar.FreightCar;
import org.anngudin.laba3.Auto.Autobus.Autobus;

public class Main {
    public static void main(String[] args) {
        Autobus autobus = new Autobus("Maz", "Carbifeous", 7, 250, 2500, 20, 10, 40);
        FreightCar freightCar = new FreightCar("Man", "Disel", 11, 251, 10501, 11, "Closed");
        Minivan minivan = new Minivan("Nissan", "Disel", 3, 200, 1100, 21, 4);
        Pickup pickup = new Pickup("Mazda", "Disel", 2, 190, 1000, 20, 5);
        autobus.print();
        autobus.show();
        freightCar.print();
        freightCar.show();
        minivan.print();
        minivan.show();
        pickup.print();
        pickup.show();
    }
}
