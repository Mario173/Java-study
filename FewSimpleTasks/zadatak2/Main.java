package hr.vestigo.java.tecaj.zadatak2;

/**
 * Class used for starting the parking lot
 * @author Mario
 *
 */
public class Main {
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		ParkingLot myPark = new ParkingLot(10, 24, 9, 0, 5, 0);
		
		// 6 handicapped cars
		myPark.parkMultipleVehiclesOfSameType(6, new Car(VehicleType.HANDICAPPED));
		
		// 8 regular trucks
		myPark.parkMultipleVehiclesOfSameType(8, new Truck(VehicleType.REGULAR));
		
		// 3 regular cars
		myPark.parkMultipleVehiclesOfSameType(3, new Car(VehicleType.REGULAR));
		
		// 1 handicapped truck
		myPark.parkMultipleVehiclesOfSameType(1, new Truck(VehicleType.HANDICAPPED));
		
		// 1 regular truck
		myPark.parkMultipleVehiclesOfSameType(1, new Truck(VehicleType.REGULAR));
		
		// 1 handicapped truck
		myPark.parkMultipleVehiclesOfSameType(1, new Truck(VehicleType.HANDICAPPED));
		
		// 3 regular bikes
		myPark.parkMultipleVehiclesOfSameType(3, new Bike(VehicleType.REGULAR));
		
		// 1 regular car
		myPark.parkMultipleVehiclesOfSameType(1, new Car(VehicleType.REGULAR));
		
		System.out.println("The parking lot is full: " + myPark.isFull());
		
		System.out.println();
		
		myPark.showFreeSpots();
	}

}
