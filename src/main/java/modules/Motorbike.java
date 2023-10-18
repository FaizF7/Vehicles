package modules;

import interfaces.IFuel;

public class Motorbike extends Vehicle implements IFuel{

    private int tankSize;

    public Motorbike(String name, String fuelType,int tankSize, int numWheels, Boolean isClean){
        super(name, fuelType,numWheels, isClean);
        this.tankSize=tankSize;

    }

    public String fuelUp(){
        return "Motorbike tank filled with " +this.getFuelType()+ " to " +this.getTankSize()+ " capacity";

    }

    public String fuelUp(String superFuel){
        return "Motorbike tank filled with super " +this.getFuelType()+ " to " +this.getTankSize()+ " capacity";
    }

    public double cleanPrice(){
        return 10 + this.getNumWheels()*5;
    };

    @Override
    public int getTankSize() {
        return tankSize;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }
}
