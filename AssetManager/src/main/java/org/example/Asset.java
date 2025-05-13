package org.example;

public class Asset {
    private String desc;
    private String dateAcquired;
    private double originalCost;

    public Asset(String desc, String dateAcquired, double originalCost) {
        this.desc = desc;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public double getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(double originalCost) {
        this.originalCost = originalCost;
    }
    public double getValue(){
        return originalCost;
    }
}
