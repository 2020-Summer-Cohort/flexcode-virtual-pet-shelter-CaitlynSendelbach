package shelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

    Map<String, VirtualPet> pets = new HashMap<>();

    public Collection<VirtualPet> getAllPets() {
        return pets.values();
    }

    public String showPets() {
        for (VirtualPet petInfo : getAllPets()) {
            System.out.println(petInfo.findName() + "    | " + petInfo.getAttributes());
        }
        return "";
    }

    public void add(VirtualPet pet) {
        pets.put(pet.findName(), pet);
    }

    public VirtualPet findPet(String petName) {
        return pets.get(petName);
    }

    public void adopt(VirtualPet pet) {
        pets.remove(pet.findName(), pet);
    }

    public void feedAllPets() {
        for (VirtualPet petInfo : pets.values()) {
            petInfo.feed(7);
        }

    }

    public void waterAllPets() {
        for (VirtualPet petInfo : pets.values()) {
            petInfo.water(7);
        }
    }

    public void playAllPets() {
        for (VirtualPet petInfo : pets.values()) {
            petInfo.play(7);
        }
    }

    public void playWithOnePet(String petName) {
        VirtualPet petToPlayWith = findPet(petName);
        petToPlayWith.play(7);

    }


    public String showDescriptions() {
        for (VirtualPet petInfo : getAllPets()) {
            System.out.println(petInfo.findName() + " " + petInfo.getDescription());
        }
        return "";
    }

    public void tick() {
        for (VirtualPet petInfo : pets.values()) {
            petInfo.increaseAttributes();
        }
    }

    public void cleanPetCage(String petName) {
        VirtualPet petCageToClean = findPet(petName);
        petCageToClean.clean(10);
    }
}
