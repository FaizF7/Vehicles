package modules;

import interfaces.ICharge;
import interfaces.IFuel;

import java.util.ArrayList;

public class PetrolStation {

    int fuelStock;
    double till;
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


    public void addFuellingPriceToTill(IFuel vehicle){
        till += vehicle.getTankSize() *1.5;
    }

    public void addChargingPriceToTill(ICharge vehicle){
        till += vehicle.getBatterySize() *1.5;
    }



    public void addCleanPriceToTill(Vehicle vehicle){
        till+=vehicle.cleanPrice();
    }

    public int getFuelStock() {
        return this.fuelStock;
    }

    public void setFuelStock(int fuelStock) {
        this.fuelStock = fuelStock;
    }

    public double getTill() {
        return this.till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Vehicle> getVehicles() {
        return this.vehicles;
    }

}
