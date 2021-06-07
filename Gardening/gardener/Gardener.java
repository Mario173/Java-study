package hr.vestigo.java.tecaj.gardener;

import hr.vestigo.java.tecaj.exceptions.InvalidPlantType;
import hr.vestigo.java.tecaj.exceptions.SpaceOccupiedException;
import hr.vestigo.java.tecaj.garden.Garden;
import hr.vestigo.java.tecaj.garden.Plot;
import hr.vestigo.java.tecaj.plants.Plantable;

/**
 * Class representing a gardener who takes care of the garden.
 * @author Mario
 *
 */
public class Gardener {
	/**
	 * Default constructor
	 */
	public Gardener() {
		super();
	}
	
	/**
	 * Gardener plants a plant in the first free space in the given garden
	 * @param g garden where the plant should be planted
	 * @param p plant that needs to be planted
	 * @throws NoRoomInGardenException if there is no room in the garden for the given plant
	 */
	boolean plant(Garden g, Plantable p) throws NoRoomInGardenException {
		try {
			for(int i = 0; i < g.flowerbedsAndOrchards.length; i++) {
				if(g.flowerbedsAndOrchards[i] == null) {
					throw new NoRoomInGardenException(p.getClass().toString());
				}
				if(g.flowerbedsAndOrchards[i].countPlants() == Plot.CAPACITY) {
					continue;
				} else {
					try {
						if(g.flowerbedsAndOrchards[i].addPlant(g.flowerbedsAndOrchards[i].countPlants(), p)) {
							return true;
						}
					} catch(InvalidPlantType e1) {
						// System.out.println(e1.message);
						// return;
						continue;
					} catch(SpaceOccupiedException e2) {
						System.out.println(e2.message);
						return false;
					}
				}
			}
			throw new NoRoomInGardenException(p.getClass().toString());
		} catch(NoRoomInGardenException e) {
			System.out.println(e.message);
			return false;
		}
	}
	
	/**
	 * Prints the contents of the garden
	 * @param g garden which we want to admire
	 */
	void admirePlants(Garden g) {
		for(int i = 0; i < g.flowerbedsAndOrchards.length; i++) {
			if(g.flowerbedsAndOrchards[i] != null) {
				System.out.println(g.flowerbedsAndOrchards[i].toString());
			}
		}
	}
	
	/**
	 * Waters all the plants in the given garden
	 * @param g garden ready for watering
	 */
	void waterPlants(Garden g) {
		for(int i = 0; i < g.flowerbedsAndOrchards.length; i++) {
			if(g.flowerbedsAndOrchards[i] != null) {
				for(int j = 0; j < Plot.CAPACITY; j++) {
					if(g.flowerbedsAndOrchards[i].getPlant(j) != null) {
						g.flowerbedsAndOrchards[i].getPlant(j).addWater();
					}
				}
			}
		}
	}
	
	/**
	 * Adds a new plot into the garden
	 * @param g garden which needs a new plot
	 * @param p new plot to be added
	 */
	public void addPlotIntoGarden(Garden g, Plot p) {
		for(int i = 0; i < g.flowerbedsAndOrchards.length; i++) {
			if(g.flowerbedsAndOrchards[i] == null) {
				g.flowerbedsAndOrchards[i] = p;
				return;
			}
		}
		System.out.println("There's no more room in this garden, try making another one.");
	}
}
