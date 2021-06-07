package hr.vestigo.java.tecaj.exceptions;

@SuppressWarnings("serial")
public class InvalidPlantType extends Exception {
	public String message;
	
	/**
	 * Constructor
	 * @param typeOfGarden flowerbed or orchard, depending on a garden
	 */
	public InvalidPlantType(String typeOfGarden) {
		this.message = "Can't plant ";
		if(typeOfGarden.equalsIgnoreCase("flowerbed")) {
			this.message += "trees ";
		} else {
			this.message += "flowers ";
		}
		this.message += ("in a " + typeOfGarden + "!");
	}
}
