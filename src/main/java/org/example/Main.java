package org.example;

import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Car car = new Car(8, "Base car");

        car.startEngine();

        car.accelerate();

        car.brake();

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");

        mitsubishi.startEngine();

        mitsubishi.accelerate();

        mitsubishi.brake();

        Car ford = new Ford(6, "Ford Falcon");

        ford.startEngine();

        ford.accelerate();

        ford.brake();

        Car holden = new Holden(6, "Holden Commodore");

        holden.startEngine();

        holden.accelerate();

        holden.brake();
    }
}