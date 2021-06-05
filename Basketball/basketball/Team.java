package basketball;

/**
 * Class representing a basketball team.
 * @author Mario
 *
 */
public class Team {
	String jerseyColor;
	int defenseStats;
	int attackStats;
	
	/**
	 * Constructor of a Team
	 * @param color string representing the color of the team's jersey
	 * @param atk integer representing the strength of team's attack, 1<=atk<=100
	 * @param def integer representing the strength of team's defense, 1<=def<=100
	 */
	public Team(String color, int atk, int def) {
		super();
		this.jerseyColor = color;
		
		try {
//			Without checkTheStatistics(atk, def):
//			if(def < 1 || def > 100) {
//				throw new RangeException("Defense", 1, 100);
//			}
//			if(atk < 1 || atk > 100) {
//				throw new RangeException("Attack", 1, 100);
//			}
			if(!checkTheStatistics(atk, def)) {
				throw new RangeException("Attack or Defense", 1, 100);
			}
			this.defenseStats = def;
			this.attackStats = atk;
		} catch(RangeException e) {
			System.out.println(e.message);
			e.printStackTrace();
			System.exit(1);
		}
	}
	
	/**
	 * Checks if the attributes attack and defense are out of valid range
	 * @param attack integer representing the strength of team's attack
	 * @param defense integer representing the strength of team's defense
	 * @return false if either attack or defense is out of range, true otherwise
	 */
	public boolean checkTheStatistics(int attack, int defense) {
		if(attack < 1 || attack > 100 || defense < 1 || defense > 100) {
			return false;
		}
		return true;
	}
	
	/**
	 * Calculates the number of points the team scored
	 * @return number of points the team scored
	 */
	public int pointsScored(int attack) {
//		Without variable int attack
//		if(this.attackStats < 10) {
//			return 0;
//		}
//		return (this.attackStats / 10) * 12;
		if(attack < 10) {
			return 0;
		}
		return (attack / 10) * 12;
	}
	
	/**
	 * Calculates the number of fouls the team commited
	 * @return number of fouls team commited
	 */
	public int numberOfFouls(int defense) {
//		Without variable int defense
//		return (100 - this.defenseStats) / 10;
		return (100 - defense) / 10;
	}
}
