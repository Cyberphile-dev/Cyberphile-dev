/*
 These symbols make multi-line comments
Anything between them does not get executed 
It is important to add comments to document your code
Mr. Garcia   <---------	(Your name goes here)
Bicycle Class and Notes

*/

// This is a single line comment this also wont get executed


public class Bicycle{

//Put member variables here (what do bikes have?)
	int wheels;
	int seats;
	boolean gears;
	int gearNumber;
	boolean brake;
	int speed;

// Methods can NOT be Forward declared

// All executable lines must have a SEMICOLON (;)
//Methods that only have () are said to not have 
//any parameters
//if you want to throw some information/data to the
//methods you must allow methods to accept parameters

//This section below this comment is a constructor with
//No parameters (Does not accept input)

	public Bicycle(){
		
		this.wheels=2;
		this.seats=1;
		this.gears=false;
		this.gearNumber=0;
	 	this.brake=true;
		this.speed=0;
	}
//Constructor that accepts parameters
//Between the parenthesis are the parameters that determine variables	
	public Bicycle(boolean g, int gNum, boolean hasBrakes){
		this.wheels =2;
		this.seats =1;
		this.gears = g;
		this.gearNumber = gNum;
		this.brake = hasBrakes;
		this.speed = 0;
	}

/*
Methods either have a return type, or they do not
this can be seen in the method declaration

public void printHouse();

This void means their is no return. Think of throwing something
into the void and it disappears.

public boolean isStudent();

This boolean means the return type is boolean and someone is 
or is not a student

*/

	public void Pedal(){
		this.speed = 5;
		System.out.println("Bicycle is moving.");
	}
	public boolean Brake(){
		this.speed = 0;
		System.out.println("Bicycle has stopped.");
		return true;
	}

}

