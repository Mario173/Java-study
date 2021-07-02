package hr.vestigo.java.tecaj.zadatak2;

/**
 * Class representing the parking lot
 * @author Mario
 *
 */
public class ParkingLot {
	int regularLargeSpaces;
	int regularMediumSpaces;
	int regularSmallSpaces;
	int handicappedLargeSpaces;
	int handicappedMediumSpaces;
	int handicappedSmallSpaces;
	
	/**
	 * Constructor for the parking lot
	 * @param numRegLarge number of large regular spaces
	 * @param numRegMed number of medium regular spaces
	 * @param numRegSmall number of small regular spaces
	 * @param numHanLarge number of large handicapped spaces
	 * @param numHanMedium number of medium handicapped spaces
	 * @param numHanSmall number of small handicapped spaces
	 */
	public ParkingLot(int numRegLarge, int numRegMed, int numRegSmall, int numHanLarge, int numHanMedium, int numHanSmall) {
		this.handicappedLargeSpaces = numHanLarge;
		this.handicappedMediumSpaces = numHanMedium;
		this.handicappedSmallSpaces = numHanSmall;
		this.regularLargeSpaces = numRegLarge;
		this.regularMediumSpaces = numRegMed;
		this.regularSmallSpaces = numRegSmall;		
	}
	
	/**
	 * Try to park the given vehicle in the parking lot 
	 * @param newVehicle vehicle to be parked
	 */
	public void park(Vehicle newVehicle) {
		if(newVehicle.getIsHandicapped() == VehicleType.REGULAR) {
			switch(newVehicle.getSize()) {
			 	case LARGE:
			 		if(this.regularLargeSpaces > 0) {
			 			this.regularLargeSpaces--;
			 			System.out.println("The car has parked in a " + newVehicle.getSize() + " " + newVehicle.getIsHandicapped() + ".");
			 		} else {
			 			System.out.println("Not enough space!");
			 		}
			 		break;
			 	case MEDIUM:
			 		if(this.regularMediumSpaces > 0) {
			 			this.regularMediumSpaces--;
			 			System.out.println("The car has parked in a " + newVehicle.getSize() + " " + newVehicle.getIsHandicapped() + ".");
			 		} else if(this.regularLargeSpaces > 0) {
			 			this.regularLargeSpaces--;
			 			System.out.println("The car has parked in a LARGE " + newVehicle.getIsHandicapped() + ".");
			 		} else {
			 			System.out.println("Not enough space!");
			 		}
			 		break;
			 	case SMALL:
			 		if(this.regularSmallSpaces > 0) {
			 			this.regularSmallSpaces--;
			 			System.out.println("The car has parked in a " + newVehicle.getSize() + " " + newVehicle.getIsHandicapped() + ".");
			 		} else if(this.regularMediumSpaces > 0) {
			 			this.regularMediumSpaces--;
			 			System.out.println("The car has parked in a MEDIUM " + newVehicle.getIsHandicapped() + ".");
			 		} else if(this.regularLargeSpaces > 0) {
			 			this.regularLargeSpaces--;
			 			System.out.println("The car has parked in a SMALL " + newVehicle.getIsHandicapped() + ".");
					} else {
			 			System.out.println("Not enough space!");
			 		}
			 		break;
			 	default:
			 		System.out.println("Size of the vehicle not set!");
			};
		} else if(newVehicle.getIsHandicapped() == VehicleType.HANDICAPPED) {
			switch(newVehicle.getSize()) {
		 	case LARGE:
		 		if(this.handicappedLargeSpaces > 0) {
		 			this.handicappedLargeSpaces--;
		 			System.out.println("The car has parked in a " + newVehicle.getSize() + " " + newVehicle.getIsHandicapped() + ".");
		 		} else if(this.regularLargeSpaces > 0) {
		 			System.out.println("The car has parked in a " + newVehicle.getSize() + " REGULAR.");
		 			this.regularLargeSpaces--;
		 		} else {
		 			System.out.println("Not enough space!");
		 		}
		 		break;
		 	case MEDIUM:
		 		if(this.handicappedMediumSpaces > 0) {
		 			System.out.println("The car has parked in a " + newVehicle.getSize() + " " + newVehicle.getIsHandicapped() + ".");
		 			this.handicappedMediumSpaces--;
		 		} else if(this.handicappedLargeSpaces > 0) {
		 			System.out.println("The car has parked in a LARGE " + newVehicle.getIsHandicapped() + ".");
		 			this.handicappedLargeSpaces--;
				} else if(this.regularMediumSpaces > 0) {
					System.out.println("The car has parked in a " + newVehicle.getSize() + " REGULAR.");
		 			this.regularMediumSpaces--;
		 		} else if(this.regularLargeSpaces > 0) {
		 			System.out.println("The car has parked in a LARGE REGULAR.");
		 			this.regularLargeSpaces--;
				} else {
		 			System.out.println("Not enough space!");
		 		}
		 		break;
		 	case SMALL:
		 		if(this.handicappedSmallSpaces > 0) {
		 			System.out.println("The car has parked in a " + newVehicle.getSize() + " " + newVehicle.getIsHandicapped() + ".");
		 			this.handicappedSmallSpaces--;
		 		} else if(this.handicappedMediumSpaces > 0) {
		 			System.out.println("The car has parked in a MEDIUM " + newVehicle.getIsHandicapped() + ".");
		 			this.handicappedMediumSpaces--;
		 		} else if(this.handicappedLargeSpaces > 0) {
		 			System.out.println("The car has parked in a LARGE " + newVehicle.getIsHandicapped() + ".");
		 			this.handicappedLargeSpaces--;
				} else if(this.regularSmallSpaces > 0) {
					System.out.println("The car has parked in a " + newVehicle.getSize() + " REGULAR.");
		 			this.regularSmallSpaces--;
				} else if(this.regularMediumSpaces > 0) {
					System.out.println("The car has parked in a MEDIUM REGULAR.");
					this.regularMediumSpaces--;
				} else if(this.regularLargeSpaces > 0) {
					System.out.println("The car has parked in a LARGE REGULAR.");
					this.regularLargeSpaces--;
		 		} else {
		 			System.out.println("Not enough space!");
		 		}
		 		break;
		 	default:
		 		System.out.println("Size of the vehicle not set!");
			};
		}
	}
	
	/**
	 * Prints out how many of each type of parking lot spots are left
	 */
	public void showFreeSpots() {
		System.out.println("There are " + this.handicappedLargeSpaces + " LARGE HANDICAPPED spots left.");
		System.out.println("There are " + this.handicappedMediumSpaces + " MEDIUM HANDICAPPED spots left.");
		System.out.println("There are " + this.handicappedSmallSpaces + " SMALL HANDICAPPED spots left.");
		System.out.println("There are " + this.regularLargeSpaces + " LARGE REGULAR spots left.");
		System.out.println("There are " + this.regularMediumSpaces + " MEDIUM REGULAR spots left.");
		System.out.println("There are " + this.regularSmallSpaces + " SMALL REGULAR spots left.");
	}
	
	/**
	 * Checks is the parking lot full
	 * @return true if the parking lot is full, false otherwise
	 */
	public boolean isFull() {
		if(this.handicappedLargeSpaces != 0 || this.handicappedMediumSpaces != 0 || this.handicappedSmallSpaces != 0
				|| this.regularLargeSpaces != 0 || this.regularMediumSpaces != 0 || this.regularSmallSpaces != 0) {
			return false;
		}
		return true;
	}
	
	/**
	 * Method for parking multiple same vehicles (same size and same type)
	 * @param howMany number of vehicles to be parked
	 * @param whatVehicle what type of vehicle will be parked
	 */
	public void parkMultipleVehiclesOfSameType(int howMany, Vehicle whatVehicle) {
		System.out.println("Parking " + whatVehicle.getSize() + " " + whatVehicle.getIsHandicapped() + " vehicles:");
		for(int i = 0; i < howMany; i++) {
			this.park(whatVehicle);
		}
		
		System.out.println();
	}
}
