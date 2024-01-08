package com.scenes.devkasatkin;

import com.heroes.devkasatkin.Hero;

public abstract class Scene {
	private int doorСount;
	private int monsterCount;
	private int treasureCount;
	private String textLor;

	private Hero[] heroes;

	public Scene(int doorСount, int monsterCount, int treasureCount, String textLor) {
		this.doorСount = doorСount;
		this.monsterCount = monsterCount;
		this.treasureCount = treasureCount;
		this.textLor = textLor;
	}

	public int getDoorСount() {
		return doorСount;
	}

	public void setDoorСount(int doorСount) {
		this.doorСount = doorСount;
	}

	public int getMonsterCount() {
		return monsterCount;
	}

	public void setMonsterCount(int monsterCount) {
		this.monsterCount = monsterCount;
	}

	public int getTreasureCount() {
		return treasureCount;
	}

	public void setTreasureCount(int treasureCount) {
		this.treasureCount = treasureCount;
	}

	public String getTextLor() {
		return textLor;
	}

	public void setTextLor(String textLor) {
		this.textLor = textLor;
	}
}
