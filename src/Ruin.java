import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int startAmount;
		double winChance;
		String percentageWinChance;
		int winLimit;
		double win;
		int totalMoney;
		int totalWins = 0;
		int totalLosses = 0;
		int totalSimulations;
		double winPercentage;

		System.out.println("How much money are you starting with?");
		startAmount = in.nextInt();

	
		System.out.println("What is your win chance? (Value between 0 and 1.");
		winChance = in.nextDouble();
		

		System.out.println("What is your win limit?");
		winLimit = in.nextInt();

		System.out.println("How many simulations would you like to run?");
		totalSimulations = in.nextInt();

		for (int i = 1; i <= totalSimulations; i++) {
			totalMoney = startAmount;

			while (totalMoney > 0 && totalMoney < winLimit) {
				win = Math.random();
				if (win < winChance) {
					totalMoney++;
				} else {
					totalMoney--;
				}
			} // end while loop
			if (totalMoney == 0) {
				System.out.println("Day " + i + ": You lose.");
				totalLosses++;
				if (totalLosses == 1) {
					System.out.println("You have 1 loss.");
				}
				else{
					System.out.println("You have " + totalLosses + " losses.");
				}
			} else {
				System.out.println("Day " + i + ": You win.");
				totalWins++;
				if (totalLosses == 1) {
					System.out.println("You have 1 win.");
				}
				else {
				System.out.println("You have " + totalWins + " wins.");
			}
			}
		}
		
		winPercentage = ((double)totalWins / (double)totalSimulations) * 100.0;
		System.out.println("You won " + winPercentage +"% of the time.");
		
		
		// TODO Auto-generated method stub

	}

}
