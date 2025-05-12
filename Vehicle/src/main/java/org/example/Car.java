package org.example;

public class Car  extends Vehicle{
    boolean isElectric;

    public Car(){
        super();
    }

    public Car(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity, boolean isElectric) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
        this.isElectric = isElectric;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }
}
