package com.ursamt.elevator.simulator;

import java.util.List;

public class Elevator {

	private String name;
	private int currentLevel;
	private ElevatorDirection elevatorCommand;
	private List<ElevatorUser> elevatorUsers;

	public Elevator(String name, int currentLevel, ElevatorDirection elevatorCommand,
			List<ElevatorUser> elevatorUsers) {
		this.name = name;
		this.currentLevel = currentLevel;
		this.elevatorUsers = elevatorUsers;
		this.elevatorCommand = elevatorCommand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}

	public List<ElevatorUser> getElevatorUsers() {
		return elevatorUsers;
	}

	public void setElevatorUsers(List<ElevatorUser> elevatorUsers) {
		this.elevatorUsers = elevatorUsers;
	}

	public ElevatorDirection getElevatorCommand() {
		return elevatorCommand;
	}

	public void setElevatorCommand(ElevatorDirection elevatorCommand) {
		this.elevatorCommand = elevatorCommand;
	}

	public void move(int level) throws InterruptedException {

		switch (this.elevatorCommand) {

		case UP:
			for (int i = this.currentLevel; i < level; i++) {
				System.out.println("\t\t\tServing .. " + (i + 1));
				Thread.sleep(1000);
			}
			System.out.println("\t\tReached " + level);
			this.setCurrentLevel(level);
			break;

		case DOWN:
			for (int i = this.currentLevel; i > level; i--) {
				System.out.println("\t\t\tServing .. " + (i - 1));
				Thread.sleep(1000);
			}
			System.out.println("\t\tReached " + level);
			this.setCurrentLevel(level);
			break;

		}

		System.out.println();

	}
}
