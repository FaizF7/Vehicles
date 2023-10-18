import modules.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarTest {
    Car car;

    @BeforeEach
    public void SetUp(){
        car = new Car(
                "Mercedes",
                "Electric",
                50,
                4,
                false,
                5 );
    }

    @Test
    void canChargeUp(){
        assertThat(car.chargeUp()).isEqualTo("Car battery charged to 50 capacity");
    }

    @Test
    void canCleanPrice(){
        assertThat(car.cleanPrice()).isEqualTo(55);
    }

    @Test
    public void canGetBatterySize(){
        assertThat(car.getBatterySize()).isEqualTo(50);
    }

    @Test
    public void canSetBatterySize(){
        car.setBatterySize(10);
        assertThat(car.getBatterySize()).isEqualTo(10);
    }

    @Test
    public void canGetNumDoors(){
        assertThat(car.getNumDoors()).isEqualTo(5);
    }

    @Test
    public void canSetNumDoors(){
        car.setNumDoors(4);
        assertThat(car.getNumDoors()).isEqualTo(4);
    }


}
