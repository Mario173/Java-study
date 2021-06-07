package hr.vestigo.java.tecaj.plants;

/**
 * Class representing plantable trees.
 * @author Mario
 *
 */
public abstract class Tree implements Plantable {
	public String name;
	public int timesWatered;
	
	/**
	 * Constructor for trees.
	 * @param name string representing tree name.
	 */
	Tree(String name) {
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
