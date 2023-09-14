public class loopExample{

	public static void main(String[] args){
		int skipCount = 0;
		System.out.println("The loop below will only print even values.");

		while(skipCount < 10){
			if(skipCount % 2 == 0)
				System.out.println(skipCount);
			else
				System.out.println("Number is skipped.");
			skipCount++;
				
		}
	}
}
