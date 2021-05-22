<H3>Basic Elevator Simulator In Java</H3>

This is a popular interview question. Thought of implementing it in Java.

This is a java project which simulates real time elevator (basic) operation.

This may be useful for people wanting to understand the design and logic involved in a basic elevator application.</br>
This app uses ArrayList and Threads to simulate elevator functions.

To start, 

1. Download the project to your local drive 
2. Import the project into your favorite IDE
3. Build the project and run ElevatorApp class
4. Follow the instructions displayed on the console to test the elevator application

Alternatively, you may want to compile and run the project from command prompt (windows) / Linux Terminal.


Sample Console Output:

<pre>

***********************************
Basic Elevator Simulation
ELEV1 - goes UP, ELEV2 - goes DOWn
***********************************

Elevetor [ ELEV1 ] starting from Level [ 1 ]
		User : USER2, going to: 3
			Serving .. 2
			Serving .. 3
		Reached 3

		User : USER1, going to: 5
			Serving .. 4
			Serving .. 5
		Reached 5

Elevator [ ELEV1 ] waiting at level [ 5 ]
Elevetor [ ELEV2 ] starting from Level [ 5 ]
		User : USER4, going to: 2
			Serving .. 4
			Serving .. 3
			Serving .. 2
		Reached 2

		User : USER3, going to: 1
			Serving .. 1
		Reached 1

Elevator [ ELEV2 ] waiting at level [ 1 ]
Elevator [ ELEV1 ] waiting at level [ 5 ]

Shutting down elevator : [ ELEV1 ]
Shutting down elevator : [ ELEV2 ]

</pre>
