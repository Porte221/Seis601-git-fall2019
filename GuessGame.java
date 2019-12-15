import java.util.Scanner;
public class GuessGame {

	public static void main (String [] args) {
		
		boolean hasWon = false;
		int randomNum = (int) (Math.random() * 100);
		
		System.out.println("I have randomly selected a numbe from 1 to 100");
		System.out.println("Try to guess it!");
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 10 ; i > 0 ; i--) {
			System.out.println("You have " + i + " guesses left:");
			
			int guess = input.nextInt();
			
			if( randomNum > guess) {
				System.out.println("It's greater than " + guess);
			}
			else if(randomNum < guess) {
				System.out.println("It's less than " + guess);
			}
			else if (randomNum == guess) {
				hasWon = true;
				break;
			} 
		
		}
		if (hasWon == true) {
			System.out.println("Congratulations you Win!");
		}
		else {
			System.out.println("You lose.");
			System.out.println("The number was " + randomNum);
		}
	}
	
}
