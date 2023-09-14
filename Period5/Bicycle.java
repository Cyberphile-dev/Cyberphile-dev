/* Is this valid? Yes

Anything Between these two Symbols are called comments
Specifically, these are multi-line comments

*/
 
// Is a single line comment

public class Bicycle{

// Put member variables here

	int wheels;
	int seats;
	int gears;
	boolean brake;
	int speed;

// methods can be declared here as well


// All executable lines must have a SEMICOLON! (;)
// Methods that only have () are said to not have any parameters
// If you want to throw some information/data to the methods you must
// Allow Methods to accept parameters

// This section below this comment is a constructor with no parameters

	public Bicycle(){

// Curly Braces are used to separate sections of code   {code goes here }

		this.wheels=2;
		this.seats=1;
		this.gears=2;
		this.brake=true;
		this.speed = 0;	

	}	

	public Bicycle(int a, int b, int c, boolean haveBrakes){

		this.wheels = a;
		this.seats = b;
		this.gears = c;
		this.brake = haveBrakes;
		this.speed = 0;

	}
	
// void in the following line is the return variable after calling the method
// void means nothing returns when method is called

	public void Move(){
		
		this.speed = 5;
		System.out.println("Method works.");
	}

// Boolean is the return method and when called returns boolean value
	public boolean Brake(){
		
		this.speed = 0;
		return true;
	}

}
// This  } closes the bicycle class
