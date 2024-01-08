package com.scenes.devkasatkin;

import com.heroes.devkasatkin.Hero;

public abstract class Scene {
	private int roomsСount;
	private int monsterCount;
	private int treasureCount;
	private String textLor;

	private Hero[] heroes;

	public Scene(int roomsСount, int monsterCount, int treasureCount, String textLor) {
		this.roomsСount = roomsСount;
		this.monsterCount = monsterCount;
		this.treasureCount = treasureCount;
		this.textLor = textLor;
	}

	public int getRoomsСount() {
		return roomsСount;
	}

	public void setRoomsСount(int roomsСount) {
		this.roomsСount = roomsСount;
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
