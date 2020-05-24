package shelter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    VirtualPetShelter underTest;
    VirtualPet pet1;
    VirtualPet pet2;

    @Test
    public void hungerShouldGoDownForAllPetsBy1WhenFed() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10,0);
        pet2 = new VirtualPet("Lazy", "White Mutt", 10, 10, 10,0);
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.feedAllPets();
        assertEquals(9, pet1.getHunger());
        assertEquals(9, pet2.getHunger());
    }

    @Test
    public void shouldReduceThirstBy1ForAllPetsWhenWatered() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10,0);
        pet2 = new VirtualPet("Lazy", "White Mutt", 10, 10, 10,0);
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.waterAllPets();
        assertEquals(9, pet1.getThirst());
        assertEquals(9, pet2.getThirst());
    }

    @Test
    public void shouldReduceBoredomBy1WhenPlaying() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10,0);
        pet2 = new VirtualPet("Lazy", "White Mutt", 10, 10, 10,0);
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.playAllPets();
        assertEquals(9, pet1.getBoredom());
        assertEquals(9, pet2.getBoredom());
    }

    @Test
    public void shouldAddOnePet() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10,0);
        underTest.add(pet1);
        VirtualPet retrievedPet = underTest.findPet("Rusty");
        Assertions.assertThat(retrievedPet.equals(pet1));
    }

    @Test
    public void shouldRemoveOnePet() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10,0);
        pet2 = new VirtualPet("Lazy", "White Mutt", 10, 10, 10,0);
        underTest.add(pet1);
        underTest.add(pet2);
        underTest.adopt(pet1);
        VirtualPet retrievedPet = underTest.findPet((pet1).findName());
        assertEquals(retrievedPet, null);
    }

    @Test
    public void shouldAddTwoPets() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10,0);
        pet2 = new VirtualPet("Lazy", "White Mutt", 10, 10, 10,0);
        underTest.add(pet2);
        underTest.add(pet1);
        Collection<VirtualPet> allPets = underTest.getAllPets();
        Assertions.assertThat(allPets.contains(pet1));
        Assertions.assertThat(allPets.contains(pet2));
    }


}

