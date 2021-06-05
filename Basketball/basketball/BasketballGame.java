package basketball;

/**
 * Class representing a basketball game.
 * @author Mario
 *
 */
public class BasketballGame {
	/**
	 * Each team has 5 players, in total 10 on the field
	 */
	final int numberOfPlayers = 10;
	
	/**
	 * Default constructor
	 */
	public BasketballGame() {
		super();
	}
	
	/**
	 * Calculates the number of points scored and fouls made and declares the winner
	 * @param t1 first team
	 * @param t2 second team
	 */
	public void whoWon(Team t1, Team t2) {
		if(!t1.checkTheStatistics(t1.attackStats, t1.defenseStats) 
				|| !t2.checkTheStatistics(t2.attackStats, t2.defenseStats)) {
			return;
		}
		
		int t1Points = t1.pointsScored(t1.attackStats);
		int t2Points = t2.pointsScored(t2.attackStats);
		int t1Fouls = t1.numberOfFouls(t1.defenseStats);
		int t2Fouls = t2.numberOfFouls(t2.defenseStats);
		
		if(t1Points > t2Points) {
			printWinnersStatistics(t1.jerseyColor, t1Points, t1Fouls, t2Fouls);
		} else if(t1Points < t2Points) {
			printWinnersStatistics(t2.jerseyColor, t2Points, t2Fouls, t1Fouls);
		} else {
			System.out.println("It was a draw between teams " + t1.jerseyColor + " and " + t2.jerseyColor + ".");
		}
	}
	
	/**
	 * Prints the message declaring the winner, his number of points, and if the winning
	 * team commited more fouls than the losing one.
	 * @param color jersey color of the winning team
	 * @param points number of points scored by the winning team
	 * @param foulsWon number of fouls commited by the winning team
	 * @param foulsLost number of fouls commited by the losing team
	 */
	public void printWinnersStatistics(String color, int points, int foulsWon, int foulsLost) {
		System.out.println("Team " + color + " won.");
		System.out.println("They scored " + points + " points and and made " + foulsWon + " fouls.");
		System.out.print("The winning team committed ");
		if(foulsWon > foulsLost) {
			System.out.print("more fouls than");
		} else if(foulsWon < foulsLost) {
			System.out.print("less fouls than");
		} else {
			System.out.print("the same amount of fouls as");
		}
		System.out.print(" the losing one.");
		System.out.println();
	}
	
	/**
	 * Main function. Initializes the teams and declares who the winners are.
	 * @param args
	 */
	public static void main(String[] args) {
		Team blue = new Team("Blue", 50, 74);
		Team yellow = new Team("Yellow", 43, 79);
		Team red = new Team("Red", 55, 64);
		
		BasketballGame b = new BasketballGame();
		b.whoWon(blue, yellow);
		System.out.println();
		b.whoWon(yellow, red);
		System.out.println();
		b.whoWon(red, blue);
		
//		Team wrong1 = new Team("Wrong1", 1, 110);
//		Team wrong2 = new Team("Wrong2", 0, 90);
	}
}
