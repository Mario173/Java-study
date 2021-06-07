package hr.vestigo.java.tecaj.plants;

public class Oak extends Tree {
	/**
	 * Default constructor
	 */
	public Oak() {
		super("oak");
	}
	
	/**
	 * If the plant was watered at least twice, the method changes its name to uppercase
	 * @return name of the plant
	 */
	@Override
	public String toString() {
		if(this.timesWatered >= 2) {
			this.name = this.name.toUpperCase();
		}
		return this.name;
	}
}
