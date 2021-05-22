package com.ursamt.elevator.simulator;

import java.util.Collections;

public class ElevatorWorker extends Thread {

	private boolean SHUTDOWN_HOOK = false;
	private Elevator elevator;

	public ElevatorWorker(Elevator elevator) {
		this.elevator = elevator;
	}

	public void run() {

		while (!SHUTDOWN_HOOK) {

			try {

				if (!elevator.getElevatorUsers().isEmpty()) {

					Collections.sort(elevator.getElevatorUsers());

					System.out.println("Elevetor [ " + elevator.getName() + " ] starting from Level [ "
							+ elevator.getCurrentLevel() + " ]");

					for (ElevatorUser elevatorUser : elevator.getElevatorUsers()) {
						System.out.println(
								"\t\tUser : " + elevatorUser.getName() + ", going to: " + elevatorUser.getDestLevel());
						elevator.move(elevatorUser.getDestLevel());
					}

					elevator.getElevatorUsers().clear();
				}
				System.out.println("Elevator [ " + elevator.getName() + " ] waiting at level [ "
						+ elevator.getCurrentLevel() + " ]");

				sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

	public void shutDown() {
		System.out.println("Shutting down elevator : [ " + elevator.getName()+" ]");
		this.SHUTDOWN_HOOK = true;
	}

}
