package hr.vestigo.java.tecaj.garden;

/**
 * Class representing an entire garden
 * @author Mario
 *
 */
public class Garden {
	public Plot flowerbedsAndOrchards[] = new Plot[10];
	
	public Garden() {
		super();
	}
	
	@Override
	public String toString() {
		String gardenToString = new String();
		int i = 0;
		while(this.flowerbedsAndOrchards[i] != null) {
			gardenToString += (i + ". ");
			if(this.flowerbedsAndOrchards[i] instanceof Flowerbed) {
				gardenToString += "Flowerbed:\n";
			} else {
				gardenToString += "Orchard:\n";
			}
			gardenToString += this.flowerbedsAndOrchards[i].toString();
			gardenToString += "\n";
			i++;
		}
		return gardenToString;
	}
	
	/**
	 * Adds a plot into the given garden
	 * @param p plot to be added into the garden
	 */
	public void addIntoGarden(Plot p) {
		for(int i = 0; i < this.flowerbedsAndOrchards.length; i++) {
			if(this.flowerbedsAndOrchards[i] == null) {
				this.flowerbedsAndOrchards[i] = p;
				return;
			}
		}
		System.out.println("There's no more room in this garden, try making another one.");
	}
}
