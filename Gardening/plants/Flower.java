package hr.vestigo.java.tecaj.plants;

/**
 * Class representing plantable flowers.
 * @author Mario
 *
 */
public abstract class Flower implements Plantable {
	public String name;
	public int timesWatered;
	
	/**
	 * Constructor for flowers.
	 * @param name string representing flower name.
	 */
	Flower(String name) {
		super();
		this.name = name;
		this.timesWatered = 0;
	}
	
	// javadoc written in interface Plantable
	@Override
	public void addWater() {
		this.timesWatered++;
	}
}
