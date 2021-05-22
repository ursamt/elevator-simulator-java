package com.ursamt.elevator.simulator;

public class ElevatorUser implements Comparable<ElevatorUser> {

	public ElevatorUser(String name, int destLevel, ElevatorDirection elevatorCommand) {
		super();
		this.name = name;
		this.destLevel = destLevel;
		this.elevatorCommand = elevatorCommand;
	}

	private String name;
	private int destLevel;
	private ElevatorDirection elevatorCommand;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDestLevel() {
		return destLevel;
	}

	public void setDestLevel(int destLevel) {
		this.destLevel = destLevel;
	}

	@Override
	public int compareTo(ElevatorUser elevatorUser) {
		int level = elevatorUser.getDestLevel();
		int result = 0;
		switch (this.elevatorCommand) {

		case UP:
			result = this.destLevel - level;
			break;

		case DOWN:
			result = level - this.destLevel;
			break;

		}

		return result;

	}

}
