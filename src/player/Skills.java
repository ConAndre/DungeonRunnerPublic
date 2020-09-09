package player;
//Defining skills along with setters/getters


public class Skills {
    //unfinished
    private int hitpoints = 100;
    private int strength = 20;
    private int agility = 10;
    private int dodge = 10;
    private int accuracy = 20;

    // Hitpoints
    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }
    // Strength
    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }
    // Agility
    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }
    // Dodge
    public int getDodge() {
        return dodge;
    }

    public void setDodge(int dodge) {
        this.dodge = dodge;
    }
    // Accuracy
    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public void getTotal() {
        System.out.println("----Skills----");
        System.out.println("Hitpoints: " + getHitpoints());
        System.out.println("Strength: " + getStrength());
        System.out.println("Agility: " + getAgility());
        System.out.println("Dodge: " + getDodge());
        System.out.println("Accuracy: " + getAccuracy());
        System.out.println("--------------");


    }
}
