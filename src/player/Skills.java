package player;
//Defining skills along with setters/getters


public class Skills {


    private final Player player;

    public Skills(Player player) {
        this.player = player;
    }

    //unfinished
    private int hitpoints = 100;
    private int strength = 20;
    private int agility = 10;
    private int dodge = 10;
    private int accuracy = 20;
    private int points = 0;



    public void setSkill(String skill, int amount) {
        if (skill.equalsIgnoreCase("hitpoints")) {
            setHitpoints(getHitpoints() + amount);
        } else if (skill.equalsIgnoreCase("strength")) {
            setStrength(getStrength() + amount);
        } else if (skill.equalsIgnoreCase("agility")) {
            setAgility(getAgility() + amount);
        } else if (skill.equalsIgnoreCase("dodge")) {
            setDodge(getDodge() + amount);
        } else if (skill.equalsIgnoreCase("accuracy")) {
            setAccuracy(getAccuracy() + amount);
        }
        String capitalSkill = skill.substring(0, 1).toUpperCase() + skill.substring(1);
        System.out.println( capitalSkill + " increased by " + amount );
    }

    public void getTotal() {
        System.out.println("----Skills----");
        System.out.println("Hitpoints: " + getHitpoints());
        System.out.println("Strength: " + getStrength());
        System.out.println("Agility: " + getAgility());
        System.out.println("Dodge: " + getDodge());
        System.out.println("Accuracy: " + getAccuracy());
        System.out.println("--------------");
        System.out.println("Points: " + getPoints());
    }

    public int getPoints() {
        return points;
    }

    public void addPoints(int addedPoints) {
        this.points = points + addedPoints;
    }

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
}
