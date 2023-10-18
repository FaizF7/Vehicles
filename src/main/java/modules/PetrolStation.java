package modules;

import interfaces.ICharge;
import interfaces.IFuel;

import java.util.ArrayList;

public class PetrolStation {

    int fuelStock;
    int till;
    private ArrayList<Vehicle> vehicles;

    public PetrolStation(int fuelStock){

        this.fuelStock=fuelStock;
        this.vehicles= new ArrayList<>();
        this.till=0;

    }

    public void fuelVehicle(IFuel vehicle){
        this.fuelStock-=vehicle.getTankSize();
    }
    public void addVehicle(Vehicle vehicle){
        this.vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        this.vehicles.remove(vehicle);
    }


    public double addFuelPriceToTill(IFuel vehicle){
        double price = vehicle.getTankSize() *1.5;
        return price;
    }

    public double AddChargePriceToTill(ICharge vehicle){
        double price = vehicle.getBatterySize() *1.5;
        return price;
    }

    public double addCleanPriceToTill(Motorbike vehicle){
        return (vehicle.getNumWheels())+ vehicle.getTankSize();
    }

    public double calculateCleanPrice(Car vehicle){
        double price=10;
        if (vehicle.getIsClean()==true){
            price+= (vehicle.getNumWheels() + vehicle.getNumDoors())*5;
        }

        return price;
    }

    public double addCleanPriceToTill(Vehicle vehicle){

    }



}
