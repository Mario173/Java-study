package hr.vestigo.java.tecaj.zadatak2;

/**
 * Enum representing vehicle type, regular or handicapped
 * @author Mario
 *
 */
public enum VehicleType {
	REGULAR (false),
	HANDICAPPED (true);
	
	boolean isHandicapped;
	
	/**
	 * Constructor for vehicle type
	 * @param isHandicapped is the vehicle for handicapped people or not
	 */
	private VehicleType(boolean isHandicapped) {
		this.isHandicapped = isHandicapped;
	}
	
	/**
	 * Get is vehicle for handicapped people or not
	 * @return true if it is for handicapped people, false otherwise
	 */
	public boolean isHandicapped() {
		return this.isHandicapped;
	}
}
