package player;

public class Player {

    private final Inventory inventory = new Inventory(this);
    private final Skills skills = new Skills(this);
    private final Location location = new Location(this);
    private final Combat combat = new Combat(this);
    private final Input input = new Input(this);
    private final Movement movement = new Movement(this);

    public Inventory inventory() {
        return this.inventory;
    }

    public Skills skills() {
        return this.skills;
    }

    public Location location() {
        return this.location;
    }

    public Combat combat() {
        return this.combat;
    }

    public Input input() {
        return this.input;
    }

    public Movement movement() {
        return this.movement;
    }









}
