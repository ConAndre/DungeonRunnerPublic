package player;

public class Player {

    //classes tied to player


    private final Inventory inventory = new Inventory();
    private final Skills skills = new Skills();
    private final Location location = new Location();
    private final Interactions interactions = new Interactions(this);


    public Inventory inventory() {
        return this.inventory;
    }

    public Skills skills() {
        return this.skills;
    }

    public Location location() {
        return this.location;
    }

    public Interactions interactions() {
        return this.interactions;
    }




}
