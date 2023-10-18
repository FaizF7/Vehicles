package modules;

import interfaces.IFuel;

public class Motorbike extends Vehicle implements IFuel{

    private int TankSize;

    public Motorbike(String name, String fuelType,int tankSize, int numWheels, Boolean isClean){
        super(name, fuelType, tankSize, numWheels, isClean);

    }

    public String fuelUp(){
        return "Motorbike tank filled with" +this.getFuelType()+ "to " +this.getTankSize()+ "capacity";

    }

    public String fuelUp(String superFuel){
        return "Motorbike tank filled with super " +this.getFuelType()+ " to " +this.getTankSize()+ "capacity";
    }

    public double cleanPrice(){
        return 10 + this.getNumWheels()*5;
    };


}
