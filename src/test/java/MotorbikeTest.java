import modules.Car;
import modules.Motorbike;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MotorbikeTest {
    Motorbike motorbike;

    @BeforeEach
    public void SetUp() {
        motorbike = new Motorbike(
                "Yamaha",
                "petrol",
                30,
                2,
                false);
    }

    @Test
    void canFuelUp() {
        assertThat(motorbike.fuelUp()).isEqualTo("Motorbike tank filled with petrol to 30 capacity");
    }

    @Test
    void canSuperFuelUp() {
        assertThat(motorbike.fuelUp("Super")).isEqualTo("Motorbike tank filled with super petrol to 30 capacity");
    }

    @Test
    public void canCleanPrice(){
        assertThat(motorbike.cleanPrice()).isEqualTo(20);
    }

    @Test
    public void canGetTankSize(){
        assertThat(motorbike.getTankSize()).isEqualTo(30);
    }

    @Test
    public void canSetTankSize(){
        motorbike.setTankSize(10);
        assertThat(motorbike.getTankSize()).isEqualTo(10);
    }

    @Test
    public void canGetNumWheels(){
        assertThat(motorbike.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void canSetNumWheels(){
        motorbike.setNumWheels(3);
        assertThat(motorbike.getNumWheels()).isEqualTo(3);
    }

    @Test
    public void canClean(){
        motorbike.clean();
        assertThat(motorbike.getIsClean()).isEqualTo(true);
    }



}