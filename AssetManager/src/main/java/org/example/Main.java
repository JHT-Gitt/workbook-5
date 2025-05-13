package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static void main(String[] args) {
        boolean isShow1 = false;
        boolean isShow2 = false;

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

                if(!isShow1){
                    System.out.printf(YELLOW + "%-15s %-15s %-15s %-30s %-15s %-15s %-15s %-15s\n",
                            "Description", "Date acquired","Original Cost","Address","Condition","SquareFoot","Lot size","Value" + RESET);
                    isShow1 = true;
                }

                House h = (House) a.get(i);
//                System.out.println( "\nDescription: " + h.getDesc());
//                System.out.println("Date acquired: " + h.getDateAcquired());
//                System.out.println("Original Cost: " + h.getOriginalCost());
//                System.out.println("Address: " +  h.getAddress() );
//                System.out.println("Condition: " + h.getCondition());
//                System.out.println("SquareFoot: " + h.getSquareFoot());
//                System.out.println("Lot size: " + h.getLotSize());
//                System.out.println("Value: " + h.getValue());


                System.out.printf("%-15s %-15s %-15.2f %-30s %-15d %-15d %-15d %-15.2f\n",
                        h.getDesc(), h.getDateAcquired() , h.getOriginalCost(),  h.getAddress() , h.getCondition(),
                        h.getSquareFoot(),  h.getLotSize(), h.getValue());



            }
            if(a.get(i) instanceof Vehicle){
                if(!isShow2){
                    System.out.printf(CYAN + "\n%-15s %-15s %-15s %-15s %-10s %-10s %-15s\n",
                            "Description","Date Acquired","Original Cost","Make/Model","Year","Odometer","Value" + RESET);
                    isShow2 = true;
                }
                Vehicle v = (Vehicle) a.get(i);
//                System.out.println( "\nDescription: " + v.getDesc());
//                System.out.println("Date acquired: " + v.getDateAcquired());
//                System.out.println("Original Cost: " + v.getOriginalCost());
//                System.out.println("Make/Model: " + v.getMakeModel());
//                System.out.println("Year: " + v.getYear());
//                System.out.println("Odometer: " + v.getOdometer());
//                System.out.println("Value: " + v.getValue());

                System.out.printf("%-15s %-15s %-15.2f %-15s %-10d %-10d %-15.2f\n",
                        v.getDesc(),v.getDateAcquired(), v.getOriginalCost(),v.getMakeModel(),  v.getYear(),v.getOdometer(),v.getValue());

            }

        }


    }
}