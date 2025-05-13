package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> a = new ArrayList<>();

//        a.add(new Asset("Vacay house", "2024-06-15", 50_000));
//        a.add(new Asset("Air b2b", "2024-01-09", 60_000));
//
//        a.add(new Asset("My ride", "2023-05-07", 20_000));
//        a.add(new Asset("Ubaaa","2021-11-05", 15_000));

//        for( int i = 0 ; i < a.size() ; i++){
//            System.out.println("\nDescription: " + a.get(i).getDesc());
//            System.out.println("Date acquired: " + a.get(i).getDateAcquired());
//            System.out.println("Original cost: " + a.get(i).getOriginalCost());
//            System.out.println("Value : " + a.get(i).getValue());
//        }

        a.add(new House("Vacay house" , "2024-06-15", 50_000,
                "1111, I zont know", 1, 250, 200));
        a.add(new House("Air BB", "2023-01-05", 60_000,
                "2222, Maybe I still zont dont", 3, 500, 400));

        a.add(new Vehicle("My ride","2023-05-07", 20_000,
                "Honda", 2014, 50_000));
        a.add(new Vehicle("Ubaa", "2022-05-09", 20_000,
                "Mazda", 2010, 120_000));



        for( int i = 0 ; i < a.size() ; i++) {
            if (a.get(i) instanceof House){
                House h = (House) a.get(i);
                System.out.println( "\nDescription: " + h.getDesc());
                System.out.println("Date acquired: " + h.getDateAcquired());
                System.out.println("Original Cost: " + h.getOriginalCost());
                System.out.println("Address: " + h.getAddress());
                System.out.println("Condition: " + h.getCondition());
                System.out.println("SquareFoot: " + h.getSquareFoot());
                System.out.println("Lot size: " + h.getLotSize());
                System.out.println("Value: " + h.getValue());
            }
            if(a.get(i) instanceof Vehicle){
                Vehicle v = (Vehicle) a.get(i);
                System.out.println( "\nDescription: " + v.getDesc());
                System.out.println("Date acquired: " + v.getDateAcquired());
                System.out.println("Original Cost: " + v.getOriginalCost());
                System.out.println("Make/Model: " + v.getMakeModel());
                System.out.println("Year: " + v.getYear());
                System.out.println("Odometer: " + v.getOdometer());
                System.out.println("Value: " + v.getValue());
            }

        }


    }
}