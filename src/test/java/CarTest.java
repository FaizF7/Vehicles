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
    void canChargeUp(){
        assertThat(car.chargeUp()).isEqualTo("Car battery charged to 50 capacity");
    }


}
