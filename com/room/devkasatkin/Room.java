package com.room.devkasatkin;
import com.heroes.devkasatkin.Hero;
import com.heroes.devkasatkin.HeroControl;
import com.treasure.devkasatkin.Treasure;

public abstract class Room {
    private String name;
    private boolean isMonsterHere;
    private boolean isTreasureHere;
    private boolean isExitHere;
    private boolean isExitKeyHere;

    private HeroControl monster;
    private Treasure treasure;

    public Room(String name, boolean isMonsterHere, boolean isTreasureHere, boolean isExitHere, boolean isExitKeyHere) {
        this.name = name;
        this.isMonsterHere = isMonsterHere;
        this.isTreasureHere = isTreasureHere;
        this.isExitHere = isExitHere;
        this.isExitKeyHere = isExitKeyHere;
    }

    public void addMonster(HeroControl monster) {
        if (this.isMonsterHere) {
            this.monster = monster;
        } else {
            this.monster = null;
        }
    }

    public void addTreasure(Treasure treasure) {
        if (this.isTreasureHere) {
            this.treasure = treasure;
        } else {
            this.treasure = null;
        }
    }
}
