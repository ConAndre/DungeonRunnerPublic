package Items;

import player.Player;

public class Consumable_base {

    private String name;
    private String type;
    private int change;

    public void setChange(int change) {
        this.change = change;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void onUse(Player player) {
        player.skills().setSkill(type, change);
        player.inventory().getInventory().remove(this);

    }

    public void setName(String name) {
        this.name = name;
    }
}
