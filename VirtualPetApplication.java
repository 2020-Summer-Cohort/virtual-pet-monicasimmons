import java.util.Scanner;

public class VirtualPetApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int randomFoodLevel = (int) (Math.random() * 99 + 1);
        int randomWaterLevel = (int) (Math.random() * 99 + 1);
        int randomSleepLevel = (int) (Math.random() * 99 + 1);

        VirtualPet myVirtualPet = new VirtualPet(randomFoodLevel, randomWaterLevel, randomSleepLevel);

        System.out.println("Welcome to Monica's Virtual Pet Game!");
        System.out.println(" ");
        System.out.println("What kind of animal do you want your pet to be?");
        String petType = input.nextLine();
        petType = petType.substring(0, 1).toUpperCase() + petType.substring(1).toLowerCase();
        System.out.println("What name would you like to give your " + petType + "?");
        String petName = input.nextLine();
        petName = petName.substring(0, 1).toUpperCase() + petName.substring(1).toLowerCase();
        System.out.println("Welcome to the world, " + petName + " the " + petType + "!");
        System.out.println("Food Level: " + myVirtualPet.getFoodLevel());
        if (myVirtualPet.getFoodLevel() < 50) {
            System.out.println(petName + " is hungry!");
        }
        System.out.println("Water Level: " + myVirtualPet.getWaterLevel());
        if (myVirtualPet.getWaterLevel() < 50) {
            System.out.println(petName + " is thirsty!");
        }
        System.out.println("Sleep Level: " + myVirtualPet.getSleepLevel());
        if (myVirtualPet.getSleepLevel() < 50) {
            System.out.println(petName + " is tired!");
        }
        System.out.println(" ");
        System.out.println("What do you want to do?");
        System.out.println("To feed " + petName + ", enter 1:");
        System.out.println("To give " + petName + " water, enter 2:");
        System.out.println("To give " + petName + " a nap, enter 3:");
        System.out.println("If you'd like to quit, enter 4:");
        String userChoice = input.nextLine();

        while (!userChoice.equals("4")) {
            if (userChoice.equals("1")) {
                myVirtualPet.feedNow();
                System.out.println("Thank you for feeding " + petName + "!");
                System.out.println(" ");
                System.out.println("Food Level: " + myVirtualPet.getFoodLevel());
                if (myVirtualPet.getFoodLevel() < 50) {
                    System.out.println(petName + " is hungry!");
                }
                System.out.println("Water Level: " + myVirtualPet.getWaterLevel());
                if (myVirtualPet.getWaterLevel() < 50) {
                    System.out.println(petName + " is thirsty!");
                }
                System.out.println("Sleep Level: " + myVirtualPet.getSleepLevel());
                if (myVirtualPet.getSleepLevel() < 50) {
                    System.out.println(petName + " is tired!");
                }
            } else if (userChoice.equals("2")) {
                myVirtualPet.giveWaterNow();
                System.out.println("Thank you for giving " + petName + " water!");
                System.out.println(" ");
                System.out.println("Food Level: " + myVirtualPet.getFoodLevel());
                if (myVirtualPet.getFoodLevel() < 50) {
                    System.out.println(petName + " is hungry!");
                }
                System.out.println("Water Level: " + myVirtualPet.getWaterLevel());
                if (myVirtualPet.getWaterLevel() < 50) {
                    System.out.println(petName + " is thirsty!");
                }
                System.out.println("Sleep Level: " + myVirtualPet.getSleepLevel());
                if (myVirtualPet.getSleepLevel() < 50) {
                    System.out.println(petName + " is tired!");
                }
            } else if (userChoice.equals("3")) {
                myVirtualPet.giveSleepNow();
                System.out.println("Thank you for giving " + petName + " a nap!");
                System.out.println(" ");
                System.out.println("Food Level:  " + myVirtualPet.getFoodLevel());
                if (myVirtualPet.getFoodLevel() < 50) {
                    System.out.println(petName + " is hungry!");
                }
                System.out.println("Water Level: " + myVirtualPet.getWaterLevel());
                if (myVirtualPet.getWaterLevel() < 50) {
                    System.out.println(petName + " is thirsty!");
                }
                System.out.println("Sleep Level: " + myVirtualPet.getSleepLevel());
                if (myVirtualPet.getSleepLevel() < 50) {
                    System.out.println(petName + " is tired!");
                }
            } else {
                System.out.println("I'm sorry, I don't understand...");
            }

            System.out.println(" ");
            System.out.println("To feed " + petName + ", enter 1:");
            System.out.println("To give " + petName + " water, enter 2:");
            System.out.println("To give " + petName + " a nap, enter 3:");
            System.out.println("If you'd like to quit, enter 4:");
            userChoice = input.nextLine();

            myVirtualPet.tick();

        }

        System.out.println("Thank you for playing with " + petName + " the" + petType + "! Please come back soon!");
    }
}




