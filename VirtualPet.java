public class VirtualPet {

    private int foodLevel;
    private int waterLevel;
    private int sleepLevel;

    public VirtualPet(int foodLevel, int waterLevel, int sleepLevel) {
        this.foodLevel = foodLevel;
        this.waterLevel = waterLevel;
        this.sleepLevel = sleepLevel;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public int getSleepLevel() {
        return sleepLevel;
    }


    public void feedNow() {
        foodLevel += 10;
        waterLevel -= 5;
        sleepLevel -= 5;
    }

    public void giveWaterNow() {
        waterLevel += 10;
        foodLevel -= 2;
        sleepLevel += 2;
    }

    public void giveSleepNow() {
        sleepLevel += 15;
        foodLevel -= 5;
        waterLevel -= 5;
    }

    public void tick() {
        foodLevel -= 1;
        waterLevel -= 1;
        sleepLevel -= 1;
    }
}
