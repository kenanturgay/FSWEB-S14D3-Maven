package org.example.company;

import java.util.Objects;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = Boolean.TRUE;
        this.wheels = 4;
    }


    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }


    public String startEngine() {
        printSimpleName();
        return "the car's engine is starting";
    }

    public String accelerate() {
        printSimpleName();
        return "the car is accelerating";

    }

    public String brake() {
        printSimpleName();
        return "the car is braking";

    }

    public void  printSimpleName() {
        System.out.println("Class Name: " + getClass().getSimpleName());
    }
}
