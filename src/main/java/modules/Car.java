package modules;

import interfaces.ICharge;

public class Car extends Vehicle implements ICharge {

    private int numDoors;
    private int batterySize;

    public Car(String name, String fuelType,int batterySize, int numWheels, Boolean isClean, int doors){
        super(name, fuelType, numWheels, isClean);
        this.numDoors=doors;
        this.batterySize=batterySize;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getBatterySize(){
        return this.batterySize; //Represents a battery in this case
    }

    public void setBatterySize(int batterySize) {
        this.batterySize = batterySize;
    }

    public String chargeUp(){
        return "Car battery charged to " + this.getBatterySize() + " capacity";
    }

    public double cleanPrice(){
        return 10 + this.getNumWheels()*5 + this.getNumDoors()*5;
    };


}
