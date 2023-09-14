public class Count{

	public static void main(String[] args){
	
		int count = 0;
// Use operators ++ and -- to change value of count variable
//++ Brings it up by 1
//-- Brings it down by 1
		count++;
		System.out.println(count);
		System.out.println(++count);
//After this line above count variable is equal to 2		
		 System.out.println(count);
                System.out.println(count++);
 		System.out.println(count--);
                System.out.println(--count);
		 System.out.println(count--);
                System.out.println(count);
		

//Homework Assignment goes directly below this
		if(count == 0){
			System.out.println("Count is equal to 0.");

		}	
		if(count ==1){
			System.out.println("This will not get executed.");
		}
		else{
			System.out.println("Because count is equal to 0.");
			System.out.println("You will get this message.");
		}
		
	}
}
