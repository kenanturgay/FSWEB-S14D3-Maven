package org.example.arge;

public class CarFactory {

    public static void main(String[] args) {
        CarSkeleton electricCar= new ElectricCar("tesla", "tesla desc", 700, 2000);
        HybridCar hybirdCar = new HybridCar("toyota", "tyt desc", 40,400, 8);
        GasPoweredCar gasPoweredCar= new GasPoweredCar("Cıvıc", "cvc desc", 500, 10);
        startEngine(electricCar);
        startEngine(hybirdCar);
        startEngine(gasPoweredCar);


    }

    public static void startEngine(CarSkeleton carSkeleton){

        System.out.println(carSkeleton.startEngine());

    }
}
