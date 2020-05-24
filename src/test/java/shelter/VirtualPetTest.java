package shelter;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class VirtualPetTest {

    VirtualPet foundPet;
    VirtualPet underTest;

    @Before
    public void setUp() {
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 0, 0);
        foundPet = new VirtualPet("Rusty", "", 10, 0, 0);
    }

    @Test
    public void shouldFindName() {
        VirtualPet underTest = new VirtualPet("Rusty", "", 10, 0, 0);
        String foundPet = underTest.findName();
        Assertions.assertThat(foundPet).isEqualToIgnoringCase("Rusty");
    }

    @Test
    public void shouldFindDescription() {
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 0, 0);
        String foundPet = underTest.getDescription();
        Assertions.assertThat(foundPet).isEqualToIgnoringCase("smells like a Stargazer lily fresh with morning dew");
    }

    @Test
    public void shouldReturnValueOfHunger() {
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 0, 0);
        int foundPet = underTest.getHunger();
        Assertions.assertThat(foundPet).isEqualTo(10);
    }

    @Test
    public void shouldReturnValueOfThirst() {
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 0, 10, 0);
        int foundPet = underTest.getThirst();
        Assertions.assertThat(foundPet).isEqualTo(10);
    }

    @Test
    public void shouldReturnValueOfBoredom() {
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 0, 0, 10);
        int foundPet = underTest.getBoredom();
        Assertions.assertThat(foundPet).isEqualTo(10);
    }

    @Test
    public void shouldReturnValueOfAttributes() {
        underTest = new VirtualPet("Rusty", "smells like a Stargazer lily fresh with morning dew", 10, 10, 10);
        String attributes = underTest.getAttributes();
        Assertions.assertThat(attributes).isEqualTo("10" + "10" + "10");
    }


}
