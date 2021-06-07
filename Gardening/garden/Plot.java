package hr.vestigo.java.tecaj.garden;

import hr.vestigo.java.tecaj.exceptions.*;
import hr.vestigo.java.tecaj.plants.Plantable;

/**
 * Interface representing garden plot.
 * @author Mario
 *
 */
public interface Plot {
	/**
	 * Capacity of a given garden.
	 */
	final int CAPACITY = 10;
	/**
	 * Plants a plant on a given place.
	 * @param i represents a place in the plot
	 * @param p represents a plant to be planted
	 * @return true if the plant was planted successfully, false otherwise
	 * @throws InvalidPlantType if plant type doesn't suit the garden; only flowers can grow in a flowerbed, 
	 * only trees in orchard
	 * @throws SpaceOccupiedException if the place in the garden is already taken
	 */
	public boolean addPlant(int i, Plantable p) throws InvalidPlantType, SpaceOccupiedException;
	/**
	 * Which plant is planted on a given place.
	 * @param i represents a place in the plot
	 * @return plant planted on the given place if one exists there, null otherwise
	 */
	public Plantable getPlant(int i);
	/**
	 * Filled places in the garden.
	 * @return number of plants planted in the garden
	 */
	public int countPlants();
}
