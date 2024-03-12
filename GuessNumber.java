package codesoft;
import java.util.*;


public class GuessNumber {

	public static int Random(int min,int max) {
		return (int)(Math.random()*(max-min+1)+min);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int chances=5;
		int finals=0;
		boolean again=true;
		System.out.println("WELCOME! WELCOME! WELCOME!");
		while(again) {
			int rand=Random(1,100);
			boolean guess=false;
			for(int i=0;i<chances;i++) {
				System.out.println("Chance"+(i+1));
				System.out.println("Enter your Guessed Number: ");
				int user=sc.nextInt();
				if(user==rand) {
					guess=true;
					finals+=1;
					System.out.println("You Guessed it RIGHT!!!");
					break;
				}
				else if(user>rand) {
					System.out.println("Too High");
				}
				else {
					System.out.println("Too Low");
				}
			}
			if(guess==false) {
				System.out.println("Sorry, Your Chances are Finished.");
				System.out.println("The number was "+rand);
			}
			System.out.println("Are you interested to play again? (Yes/No)");
			String userip=sc.next();
			again=userip.equalsIgnoreCase("Yes");
		}
		System.out.println("Hope you enjoyed it");
		System.out.println("Your score is "+finals);
	}
}
