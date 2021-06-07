package hr.vestigo.java.tecaj.garden;

import hr.vestigo.java.tecaj.exceptions.InvalidPlantType;
import hr.vestigo.java.tecaj.exceptions.SpaceOccupiedException;
import hr.vestigo.java.tecaj.plants.Plantable;
import hr.vestigo.java.tecaj.plants.Tree;

/**
 * Class representing a garden for trees.
 * @author Mario
 *
 */
public class Orchard implements Plot {
	Tree treesPlantedInTheGarden[] = new Tree[Plot.CAPACITY];
	int numberOfPlants;
	
	/**
	 * Default constructor.
	 */
	public Orchard() {
		super();
		numberOfPlants = 0;
	}
	
	@Override
	public boolean addPlant(int i, Plantable p) throws InvalidPlantType, SpaceOccupiedException {
		if(i > Plot.CAPACITY) {
			return false;
		}
		try {
			if(this.treesPlantedInTheGarden[i] != null) {
				throw new SpaceOccupiedException();
			} else if(!(p instanceof Tree)) {
				throw new InvalidPlantType("orchard");
			} else {
				this.treesPlantedInTheGarden[i] = (Tree) p;
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
		return this.treesPlantedInTheGarden[i];
	}
	
	@Override
	public int countPlants() {
		return this.numberOfPlants;
	}
	
	@Override
	public String toString() {
		String orchardToString = new String();
		for(int i = 0; i < Plot.CAPACITY; i++) {
			orchardToString += (i + ". ");
			if(this.treesPlantedInTheGarden[i] == null) {
				orchardToString += "*empty* ";
			} else {
				orchardToString += (this.treesPlantedInTheGarden[i].toString() + " ");
			}
			orchardToString += "| ";
		}
		return orchardToString;
	}
}
