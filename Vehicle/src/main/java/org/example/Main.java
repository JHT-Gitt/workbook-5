package org.example;

public class Main {
    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);
        System.out.println("Moped");
        System.out.println("Color : " + slowRide.getColor());
        System.out.println("Fuel Capacity : " + slowRide.getFuelCapacity());

        HoverCraft hover = new HoverCraft();
        hover.setColor("Black");
        hover.setCargoCapacity(4);
        System.out.println("\nHovercraft");
        System.out.println("Color : " + hover.getColor());
        System.out.println("Cargo Capacity : " + hover.getFuelCapacity());

        Car c = new Car();
        c.setColor("White");
        c.setCargoCapacity(5);
        c.setElectric(true);

        System.out.println("\nMazda");
        System.out.println("Color : " + c.getColor());
        System.out.println("Cargo capacity : " + c.getCargoCapacity());
        System.out.println("Fuel Type: " + c.isElectric());





    }
}