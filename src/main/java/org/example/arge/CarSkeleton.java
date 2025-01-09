package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {

        System.out.println("className: " + getClass().getSimpleName());
        return getName() + " starting engine.";

    }

    public String drive() {
        runEngine(this);
        return getName() + " is driving...";

    }

    protected void runEngine(CarSkeleton carSkeleton) {

        if (carSkeleton instanceof ElectricCar) {

            System.out.println("The car engine is starting with electric. Per charge :"+ ((ElectricCar)carSkeleton).getAvgKmPerCharge() + " battery size: " + ((ElectricCar)carSkeleton).getBatterySize());

        } else if (carSkeleton instanceof HybridCar) {

            System.out.println("The car engine is starting with hybrid. Per charge: " + ((HybridCar)carSkeleton).getAvgKmPerLiter() + " battery size: " + ((HybridCar)carSkeleton).getBatterySize() + " cylinder: " + ((HybridCar)carSkeleton).getCylinders());

        } else if (carSkeleton instanceof GasPoweredCar) {

            System.out.println("The car engine is starting with gas. Per litre: " + ((GasPoweredCar)carSkeleton).getAverageKmPerLiter() + " cylinder: " + ((GasPoweredCar)carSkeleton).getCylinders());

        } else {
            System.out.println("invalid car type");
        }

    }
}
