import java.util.*;

/*
 * 
 * @ David Breitenbeck
 * @ Bill Wilt
 * 
 */

public class Lab6 {
	public static void main(String[] args) {
		System.out.println("Welcome to Grand Circus Casino");
		int s = setSide();
		
		play(s);
		
	}
	
	public static void play(int s) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Press R to roll the Dice!");
		String entry = scanner.nextLine();
		if (entry.toLowerCase().startsWith("r")) {
			int r1 = generateRandomDieRoll(s);
			int r2 = generateRandomDieRoll(s);
			
			
			System.out.println(r1);
			System.out.println(r2);	
			
			if (r1 ==6 && r2 == 6) {
				System.out.println("Boxcars!");
			} else if (r1 ==1 && r2 == 1) {
				System.out.println("Snakeyes!");
			} else if ((r1 + r2 == 7) || (r1 +r2 ==11)) {
				System.out.println("Craps! A Natural!");
			}
		} 
		cont(s);
	
	}
	
	public static void cont(int s) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Roll again?");
		String entry = scanner.nextLine();
		if (entry.trim().toLowerCase().startsWith("y")) {
			play(s);
		} else if (entry.trim().toLowerCase().startsWith("n")) {
			System.out.println("Goodbye");
		} else {
			System.out.println("What?");
			cont(s);
		}
	}
	
	public static int setSide() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter sides of dice");
		if (!scanner.hasNextInt()) {
			System.out.println("What?");
			return setSide();
		} else {
			int side = scanner.nextInt();
			return side;
		}
		
	}

	
	public static int generateRandomDieRoll(int s) {
	Random rand = new Random();
	int roll = (rand.nextInt(s)) + 1;	
		
		return roll;
	}
	
}
