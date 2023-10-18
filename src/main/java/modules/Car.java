package modules;

import interfaces.ICharge;

public class Car extends Vehicle implements ICharge {

    private int numDoors;

    public Car(String name, String fuelType,int batterySize, int numWheels, Boolean isClean, int doors){
        super(name, fuelType, batterySize, numWheels, isClean);
        this.numDoors=doors;
    }

    public int getNumDoors() {
        return this.numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getBatterySize(){
        return this.getBatterySize(); //Represents a battery in this case
    }



    public String chargeUp(int charge){
        return "Car battery charged to " + this.getBatterySize() + "capacity";
    }

    public double cleanPrice(){
        return 10 + this.getNumWheels()*5 + this.getNumDoors()*5;
    };


}
