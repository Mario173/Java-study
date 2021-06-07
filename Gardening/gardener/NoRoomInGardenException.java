package hr.vestigo.java.tecaj.gardener;

@SuppressWarnings("serial")
public class NoRoomInGardenException extends Exception {
	String message;
	
	/**
	 * Constructor
	 * @param name name of the plant that we tried to plant
	 */
	public NoRoomInGardenException(String name) {
		this.message = "There is no room for " + name;
	}
}
