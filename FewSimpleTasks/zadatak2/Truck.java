package hr.vestigo.java.tecaj.zadatak2;

/**
 * Class representing trucks, large vehicles
 * @author Mario
 *
 */
public class Truck extends Vehicle {
	/**
	 * Constructor for trucks
	 * @param v the type of the trucks, regular or handicapped
	 */
	public Truck(VehicleType v) {
		super(CarSpaceType.LARGE, v);
	}
}
