package dungeon;

import monsters.*;

import java.util.ArrayList;

public class DungeonMonsters {


    public DungeonMonsters() {
        initDungeonMonsters();
    }

    private final ArrayList<Object> monsterList = new ArrayList<>();


    public void initDungeonMonsters() {
        monsterList.add(new Monster_Cyclops());
        monsterList.add(new Monster_Rodent());
        monsterList.add(new Monster_Darkshadow());
        monsterList.add(new Monster_Nightmare());
        monsterList.add(new Monster_Werewolf());
        monsterList.add(new Monster_Lich());


    }
    public ArrayList<Object> getMonsterList() {
        return monsterList;
    }



}
