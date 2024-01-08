package com.scenes.devkasatkin;

public abstract class Scene {
	private int doorcount;
	private int monsterCount;
	private int treasureCount;

	private String textLor;

	public Scene(int doorcount, int monsterCount, int treasureCount, String textLor) {
		this.doorcount = doorcount;
		this.monsterCount = monsterCount;
		this.treasureCount = treasureCount;
		this.textLor = textLor;
	}

	public int getDoorcount() {
		return doorcount;
	}

	public void setDoorcount(int doorcount) {
		this.doorcount = doorcount;
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
