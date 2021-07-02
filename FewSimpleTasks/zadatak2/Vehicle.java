package hr.vestigo.java.tecaj.zadatak2;

/**
 * Class representing vehicles that can be parked in the parking lot
 * @author Mario
 *
 */
public class Vehicle {
	
	CarSpaceType size;
	VehicleType typeOfParkingSpot;
	
	/**
	 * Default constructor
	 */
	public Vehicle() {
		
	}
	
	/**
	 * 
	 * @param c
	 * @param v
	 */
	public Vehicle(CarSpaceType c, VehicleType v) {
		this.size = c;
		this.typeOfParkingSpot = v;
	}
	
	/**
	 * Get the size of the vehicle
	 * @return the size of the vehicle
	 */
	public CarSpaceType getSize() {
		return this.size;
	}
	
	/**
	 * Set the size of the vehicle to the given value
	 * @param c the size of the vehicle
	 */
	public void setSize(CarSpaceType c) {
		this.size = c;
	}
	
	/**
	 * Get the type of the vehicle
	 * @return the type of vehicle, regular or handicapped
	 */
	public VehicleType getIsHandicapped() {
		return this.typeOfParkingSpot;
	}
	
	/**
	 * Set the type of the vehicle to the given value
	 * @param v the type of the vehicle
	 */
	public void setIsHandicapped(VehicleType v) {
		this.typeOfParkingSpot = v;
	}
}
