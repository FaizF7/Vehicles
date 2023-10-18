import modules.Car;
import modules.Motorbike;
import modules.PetrolStation;
import modules.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class PetrolStationTest {

    Car car;
    Motorbike motorbike;
    PetrolStation petrolStation;

    @BeforeEach
    public void SetUp() {
        petrolStation = new PetrolStation(1000);

        motorbike = new Motorbike(
                "Yamaha",
                "petrol",
                30,
                2,
                false);

        car = new Car(
                "Mercedes",
                "Electric",
                50,
                4,
                false,
                5 );

    }
    @Test
    public void canFuelVehicle(){
        petrolStation.fuelVehicle(motorbike);
        assertThat(petrolStation.getFuelStock()).isEqualTo(970);
    }

    @Test
    public void canAddVehicle(){
        petrolStation.addVehicle(motorbike);
        assertThat(petrolStation.getVehicles().size()).isEqualTo(1);
    }

    @Test
    public void canRemoveVehicle(){
        petrolStation.addVehicle(motorbike);
        petrolStation.removeVehicle(motorbike);
        assertThat(petrolStation.getVehicles().size()).isEqualTo(0);
    }

    @Test
    public void canAddFuellingPriceToTill(){
        petrolStation.addFuellingPriceToTill(motorbike);
        assertThat(petrolStation.getTill()).isEqualTo(45);
    }
    @Test
    public void canAddChargingPriceToTill(){
        petrolStation.addChargingPriceToTill(car);
        assertThat(petrolStation.getTill()).isEqualTo(75);
    }

    @Test
    public void canAddCleanPriceToTillCar(){
        petrolStation.addCleanPriceToTill(car);
        assertThat(petrolStation.getTill()).isEqualTo(55);
    }

    @Test
    public void canAddCleanPriceToTillMotorbike(){
        petrolStation.addCleanPriceToTill(motorbike);
        assertThat(petrolStation.getTill()).isEqualTo(20);
    }

    
    @Test
    public void canGetTill(){
        assertThat(petrolStation.getTill()).isEqualTo(0);
    }

    @Test
    public void canSetTill(){
        petrolStation.setTill(10);
        assertThat(petrolStation.getTill()).isEqualTo(10);
    }

    @Test
    public void canGetVehicles(){
        assertThat(petrolStation.getVehicles().size()).isEqualTo(0);
    }

    @Test
    public void canGetFuelStock(){
        assertThat(petrolStation.getFuelStock()).isEqualTo(1000);
    }

    @Test
    public void canSetFuelStock(){
        petrolStation.setFuelStock(600);
        assertThat(petrolStation.getFuelStock()).isEqualTo(600);
    }

}
