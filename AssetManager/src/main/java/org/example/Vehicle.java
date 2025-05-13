package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vehicle extends Asset{

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String desc, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(desc, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    public double getValue(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate t = LocalDate.parse(getDateAcquired(), formatter);
        double value;
        int age = t.getYear() - year;

        if(age <= 3){
            value = (getOriginalCost() * (.03 * age));
        }else if(age <= 6){
            value = (getOriginalCost() * (.06 * age));
        }else if(age <=10){
            value = (getOriginalCost() * (.08 * age));;
        }else {
            value = getOriginalCost() - 1000.00 ;
        }
        if(this.odometer > 100000 && !this.makeModel.contains("Honda")
                && !this.makeModel.contains("Toyota")){
            value *=.75;
        }
        return value;
    }

}
