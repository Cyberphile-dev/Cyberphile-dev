public class Count{


	public static void main(String [] args){
		int count = 0;
		System.out.println(count);
		count++;
		System.out.println(count);
		System.out.println(++count);
		System.out.println(count--);
		System.out.println(--count);


		if(count == 0){
			System.out.println("Count is currently equal to : " + count);
		}
		
		if(count ==1){
			System.out.println("This should not get executed.");

		}
		else{
			System.out.println("This should get executed.");
		}
	}
/* Make a variable of integer type and have the value change 
and print corresponding statements where you change value 4 times and print out
changes when the conditional is true.


int value = 0;
value = 1;

if(value == 1){
	System.out.println(value);
}
//You do rest
*/
}
