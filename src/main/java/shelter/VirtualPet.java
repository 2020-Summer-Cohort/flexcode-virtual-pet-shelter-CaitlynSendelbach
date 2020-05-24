package shelter;

public class VirtualPet {
    private String petName;
    private String description;
    private int hunger;
    private int thirst;
    private int boredom;
    private int cleanliness;

    public VirtualPet(String petName, String description, int hunger, int thirst, int boredom, int cleanliness) {
        this.petName = petName;
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.cleanliness = cleanliness;
    }

    public String findName() {
        return petName;

    }

    public String getDescription() {
        return description;
    }

    public int getHunger() {
        return hunger;

    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public String getAttributes() {
        String hungStr = String.valueOf(hunger);
        String thirstStr = String.valueOf(thirst);
        String boreStr = String.valueOf(boredom);
        String cleanStr = String.valueOf(cleanliness);
        return (hungStr + "    | " + thirstStr + "    | " + boreStr + "    | " + cleanStr);
    }

    public void feed(int hungerFeed) {
        hunger -= hungerFeed;
    }

    public void water(int waterThirst) {
        thirst -= waterThirst;
    }

    public void play(int playBoredom) {
        boredom -= playBoredom;
    }


    public void increaseAttributes() {
        hunger = hunger + 5;
        thirst = thirst + 5;
        boredom = boredom + 5;
        cleanliness = cleanliness + 5;
    }

    public void clean(int dirtiness) {
        cleanliness -= dirtiness;
    }
}