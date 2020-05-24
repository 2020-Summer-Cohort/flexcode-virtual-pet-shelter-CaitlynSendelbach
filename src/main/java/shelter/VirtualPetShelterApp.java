package shelter;


import java.util.Scanner;

public class VirtualPetShelterApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int userAction = 0;
        String userInput;
        VirtualPetShelter shelterPets = new VirtualPetShelter();
        shelterPets.add(new VirtualPet("Rusty", "German Shepard", 10, 10, 10, 5));
        shelterPets.add(new VirtualPet("Tula", "White Bunny", 10, 10, 10, 5));
        System.out.println("Thank you for volunteering at Hare's Pet Shelter!");
        System.out.println();


        while (userAction != 7) {
            System.out.println("This is the status of your pets:");
            System.out.println();
            System.out.println("Name: " + "Hunger: " + "Thirst:  " + "Boredom:  " + "Cleanliness:  ");
            System.out.println("--------|-------|-------|-------|-------");
            System.out.println(shelterPets.showPets());
            System.out.println();
            System.out.println("What would you like to do next?");
            System.out.println("1. Feed the pets");
            System.out.println("2. Water the pets");
            System.out.println("3. Play with a pet");
            System.out.println("4. Adopt a pet");
            System.out.println("5. Admit a pet");
            System.out.println("6. Clean a pets cage");
            System.out.println("7. Quit");
            userAction = input.nextInt();
            input.nextLine();
            if (userAction == 1) {
                System.out.println("You have chosen to feed the pets");
                shelterPets.feedAllPets();
                shelterPets.tick();
            }
            if (userAction == 2) {
                System.out.println("You have chose to water the pets");
                shelterPets.waterAllPets();
                shelterPets.tick();
            }
            if (userAction == 3) {
                System.out.println("Which pet would you like to play with?");
                System.out.println(shelterPets.showDescriptions());
                userInput = input.nextLine();
                System.out.println();
                System.out.println("Ok you play with " + userInput);
                shelterPets.playWithOnePet(userInput);
                shelterPets.tick();
            }
            if (userAction == 4) {
                System.out.println("Which pet would you like to adopt?");
                userInput = input.nextLine();
                System.out.println("You have chose to adopt " + userInput);
                System.out.println("Take good care of them!");
                shelterPets.adopt(shelterPets.findPet(userInput));
                shelterPets.tick();
            }
            if (userAction == 5) {
                String petDescription;
                System.out.println("You would like to admit a pet!");
                System.out.println("Please enter their name");
                userInput = input.nextLine();
                System.out.println("Please enter their description");
                petDescription = input.nextLine();
                shelterPets.add(new VirtualPet(userInput, petDescription, 10, 10, 10, 5));
                System.out.println("We will take good care of " + userInput);
                shelterPets.tick();
            } if (userAction == 6){
                System.out.println("Which pets cage would you like to clean?");
                userInput = input.nextLine();
                System.out.println("You have chose to clean " + userInput + "s cage!");
                shelterPets.cleanPetCage(userInput);
            }
        }


    }
}
