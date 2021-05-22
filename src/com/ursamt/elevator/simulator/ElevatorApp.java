package com.ursamt.elevator.simulator;

import java.util.ArrayList;
import java.util.List;

public class ElevatorApp {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("***********************************");
		System.out.println("Basic Elevator Simulation");
		System.out.println("ELEV1 - goes UP, ELEV2 - goes DOWn");
		System.out.println("***********************************");
		System.out.println();

		List<ElevatorUser> elevatorUpUsers = new ArrayList<>(2);
		List<ElevatorUser> elevatorDownUsers = new ArrayList<>(2);

		ElevatorUser elevatorUser1 = new ElevatorUser("USER1", 5, ElevatorDirection.UP);
		ElevatorUser elevatorUser2 = new ElevatorUser("USER2", 3, ElevatorDirection.UP);

		elevatorUpUsers.add(elevatorUser1);
		elevatorUpUsers.add(elevatorUser2);

		ElevatorUser elevatorUser3 = new ElevatorUser("USER3", 1, ElevatorDirection.DOWN);
		ElevatorUser elevatorUser4 = new ElevatorUser("USER4", 2, ElevatorDirection.DOWN);

		elevatorDownUsers.add(elevatorUser3);
		elevatorDownUsers.add(elevatorUser4);

		Elevator elevator1 = new Elevator("ELEV1", 1, ElevatorDirection.UP, elevatorUpUsers);
		Elevator elevator2 = new Elevator("ELEV2", 5, ElevatorDirection.DOWN, elevatorDownUsers);

		ElevatorWorker elevatorWorker1 = new ElevatorWorker(elevator1);
		elevatorWorker1.start();

		Thread.sleep(5000);

		ElevatorWorker elevatorWorker2 = new ElevatorWorker(elevator2);
		elevatorWorker2.start();

		Thread.sleep(12000);

		System.out.println();

		elevatorWorker1.shutDown();
		elevatorWorker2.shutDown();

	}

}
