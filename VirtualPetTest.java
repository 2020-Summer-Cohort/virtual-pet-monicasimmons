import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class VirtualPetTest {

    VirtualPet underTest = new VirtualPet(30, 40, 20);

    @Test
    public void getFoodLevelShouldBe30WhenInitialFoodLevelIs30() {
        int actualFoodLevel = underTest.getFoodLevel();
        assertThat(actualFoodLevel, is(30));
    }

    @Test
    public void getWaterLevelShouldBe40WhenInitialWaterLevelIs40() {
        int actualWaterLevel = underTest.getWaterLevel();
        assertThat(actualWaterLevel, is(40));
    }

    @Test
    public void getSleepLevelShouldBe20WhenInitialSleepLevelIs20() {
        int actualSleepLevel = underTest.getSleepLevel();
        assertThat(actualSleepLevel, is(20));
    }
}

