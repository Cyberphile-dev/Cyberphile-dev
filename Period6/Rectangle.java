/*

This is a program example of a class in java

*/


public class Rectangle{


	int length;
	int width;
	int area;

	public Rectangle(){
		this.length = 0;
		this.width = 0;
		this.area =0;

	}
	public Rectangle(int len, int wid){
		this.length = len;
		this.width = wid;
		this.area = len*wid;

	}
	public void printArea(){

		System.out.println("The Area of this Rectangle is : " + this.area + " Units Squared");
	}
}

