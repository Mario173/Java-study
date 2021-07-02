package hr.vestigo.java.tecaj.zadatak2;

/**
 * Class representing cars, medium-sized vehicles
 * @author Mario
 *
 */
public class Car extends Vehicle {
	/**
	 * Constructor for bikes
	 * @param v the type of the bike, regular or handicapped
	 */
	public Car(VehicleType v) {
		super(CarSpaceType.MEDIUM, v);
	}
}
