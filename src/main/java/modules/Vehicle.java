package modules;

import interfaces.ICharge;

public abstract class Vehicle {
    private String name;
    private String fuelType;
    private int numWheels;


    Boolean isClean;



    public Vehicle(String name, String fuelType, int numWheels, Boolean isClean){
        this.name = name;
        this.fuelType=fuelType;
        this.numWheels=numWheels;
        this.isClean=isClean;
    }

    public void clean(){
        setIsClean(true);
    }


    public abstract double cleanPrice();


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public int getNumWheels() {
        return this.numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }



    public Boolean getIsClean() {
        return this.isClean;
    }

    public void setIsClean(Boolean clean) {
        this.isClean = clean;
    }
}
