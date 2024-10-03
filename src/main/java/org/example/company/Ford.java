package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " the car's engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " the car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() + " the car is braking");
    }
}
