package org.example;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;


    public House(String desc, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(desc, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }
    public double getValue(){
        double price = 0;
        switch (this.condition){
            case 1:
                price = 180.00;
                break;
            case 2:
                price = 130.00;
                break;
            case 3:
                price = 90.00;
                break;
            case 4:
                price = 80.00;
                break;
            default:
                //System.out.println("\nInvalid");
                break;
        }
        return (price * squareFoot) + (0.25 + lotSize);
    }
}
