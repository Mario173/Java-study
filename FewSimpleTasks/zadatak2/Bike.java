package hr.vestigo.java.tecaj.zadatak2;

/**
 * Class representing bikes, smaller vehicles
 * @author Mario
 *
 */
public class Bike extends Vehicle {
	/**
	 * Constructor for bikes
	 * @param v the type of the bike, regular or handicapped
	 */
	public Bike(VehicleType v) {
		super(CarSpaceType.SMALL, v);
	}
}
