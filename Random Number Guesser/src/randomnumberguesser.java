import java.util.*;

public class randomnumberguesser {
	
	private static void RandomNumberCheck()
	{
		Scanner sc = new Scanner(System.in);
		final int max = 100; 
		 
		Random rand = new Random();
		
		int correct_answer = rand.nextInt(max)+1;
		
		int chance = 1;
		
		

		boolean found = false;
		
		while(chance<=5)
		{
			System.out.println("Chance - "+chance);
			System.out.println("Enter the Number - ");
			int number = sc.nextInt();
			
			if(number > correct_answer)
				System.out.println("High Guess,Try Again");
			
			else if(number < correct_answer)
				System.out.println("Low Guess,Try Again");
			
			else{
				System.out.println("Yes,You Guessed it Right");
				System.out.println("Congrats");
				found = true;break;
			}
			System.out.println();
			chance++;
		}
		if(found == false)
		{
			System.out.println("The Number was "+correct_answer);
			System.out.println("Better Luck Next Time");
			System.out.println();			
		}
		sc.close();
		
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("Guess the Number From 1-100");
		System.out.println("Lets Start");
		System.out.println();
		
		RandomNumberCheck();
		
	}

}
