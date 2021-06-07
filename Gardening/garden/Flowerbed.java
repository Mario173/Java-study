package hr.vestigo.java.tecaj.garden;

import hr.vestigo.java.tecaj.exceptions.InvalidPlantType;
import hr.vestigo.java.tecaj.exceptions.SpaceOccupiedException;
import hr.vestigo.java.tecaj.plants.Flower;
import hr.vestigo.java.tecaj.plants.Plantable;

/**
 * Class representing a garden for flowers.
 * @author Mario
 *
 */
public class Flowerbed implements Plot {
	Flower flowersPlantedInTheGarden[] = new Flower[Plot.CAPACITY];
	int numberOfPlants;
	
	/**
	 * Default constructor.
	 */
	public Flowerbed() {
		super();
		numberOfPlants = 0;
	}
	
	@Override
	public boolean addPlant(int i, Plantable p) throws InvalidPlantType, SpaceOccupiedException {
		if(i > Plot.CAPACITY) {
			return false;
		}
		try {
			if(this.flowersPlantedInTheGarden[i] != null) {
				throw new SpaceOccupiedException();
			} else if(!(p instanceof Flower)) {
				throw new InvalidPlantType("flowerbed");
			} else {
				this.flowersPlantedInTheGarden[i] = (Flower) p;
				this.numberOfPlants++;
			}
			
		} catch(InvalidPlantType e1) {
			// System.out.println(e1.message);
			return false;
		} catch(SpaceOccupiedException e2) {
			// System.out.println(e2.message);
			return false;
		}
		return true;
	}
	
	@Override
	public Plantable getPlant(int i) {
		return this.flowersPlantedInTheGarden[i];
	}
	
	@Override
	public int countPlants() {
		return this.numberOfPlants;
	}
	
	@Override
	public String toString() {
		String flowerbedToString = new String();
		for(int i = 0; i < Plot.CAPACITY; i++) {
			flowerbedToString += (i + ". ");
			if(this.flowersPlantedInTheGarden[i] == null) {
				flowerbedToString += "*empty* ";
			} else {
				flowerbedToString += (this.flowersPlantedInTheGarden[i].toString() + " ");
			}
			flowerbedToString += "| ";
		}
		return flowerbedToString;
	}
}
