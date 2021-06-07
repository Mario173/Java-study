package hr.vestigo.java.tecaj.plants;

public class Daffodil extends Flower {
	/**
	 * Default constructor
	 */
	public Daffodil() {
		super("daffodil");
	}
	
	/**
	 * If the plant was watered, the method changes its name to uppercase
	 * @return name of the plant
	 */
	@Override
	public String toString() {
		if(this.timesWatered >= 1) {
			this.name = this.name.toUpperCase();
		}
		return this.name;
	}
}
