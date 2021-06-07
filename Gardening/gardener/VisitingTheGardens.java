package hr.vestigo.java.tecaj.gardener;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import hr.vestigo.java.tecaj.garden.Flowerbed;
import hr.vestigo.java.tecaj.garden.Garden;
import hr.vestigo.java.tecaj.garden.Orchard;
import hr.vestigo.java.tecaj.plants.*;

/**
 * Class containing the main method, used for working on the garden
 * @author Mario
 *
 */
public class VisitingTheGardens {
	/**
	 * Executes the given command
	 * @param command string containing users command
	 * @param j gardener executing the command
	 * @param g garden on which the command is executed
	 * @throws NoRoomInGardenException if there's no room in the given garden
	 */
	public static void executeTheCommand(String command, Gardener j, Garden g) throws NoRoomInGardenException {
		if(command.length() == 0 || command.length() > 2 || 
				(command.charAt(0) == 'P' && command.length() == 1)) {
			System.out.println("That command doesn't exist, please enter an existing one.");
			return;
		}
		switch(command.charAt(0)) {
			case 'W':
				System.out.println("Gardener: Drink my children, drink and GROW! HAHAHAHAHA!!");
				j.waterPlants(g);
				break;
			case 'L':
				System.out.println("The gardener admires the plants.");
				System.out.println("Garden: ");
				j.admirePlants(g);
				break;
			case 'P':
				switch(command.charAt(1)) {
					case 'D':
						if(j.plant(g, new Daffodil())) {
							System.out.println("Gardener: I've planted a Daffodil.");
						}
						break;
					case 'T':
						if(j.plant(g, new Tulip())) {
							System.out.println("Gardener: I've planted a Tulip.");
						}
						break;
					case 'R':
						if(j.plant(g, new Rose())) {
							System.out.println("Gardener: I've planted a Rose.");
						}
						break;
					case 'V':
						if(j.plant(g, new Violet())) {
							System.out.println("Gardener: I've planted a Violet.");
						}
						break;
					case 'I':
						if(j.plant(g, new Iris())) {
							System.out.println("Gardener: I've planted an Iris.");
						}
						break;
					case 'M':
						if(j.plant(g, new Magnolia())) {
							System.out.println("Gardener: I've planted a Magnolia.");
						}
						break;
					case 'O':
						if(j.plant(g, new Oak())) {
							System.out.println("Gardener: I've planted an Oak.");
						}
						break;
					case 'P':
						if(j.plant(g, new Pine())) {
							System.out.println("Gardener: I've planted a Pine.");
						}
						break;
					case 'S':
						if(j.plant(g, new Spruce())) {
							System.out.println("Gardener: I've planted a Spruce.");
						}
						break;
					case 'E':
						if(j.plant(g, new Elm())) {
							System.out.println("Gardener: I've planted an Elm.");
						}
						break;
					default:
						System.out.println("That command doesn't exist, please enter an existing one.");
						break;
				};
				break;
			default:
				System.out.println("That command doesn't exist, please enter an existing one.");
				break;
		};
	}
	
	/**
	 * Main function, used for running the program
	 * @param args
	 * @throws NoRoomInGardenException if there's no room left in the garden
	 */
	public static void main(String[] args) throws NoRoomInGardenException {
		Garden g1 = new Garden();
		Gardener John = new Gardener();
		
		try {
			Path path = Paths.get("C:\\Users\\Mario\\Desktop\\hello.txt");
			System.out.println(path.toAbsolutePath());
			List<String> fileLines = Files.readAllLines(path);
			
			for(int i = 0; i < fileLines.size(); i++) {
				for(int j = 0; j < fileLines.get(i).length(); j++) {
					if(fileLines.get(i).charAt(j) == 'F') {
						g1.addIntoGarden(new Flowerbed());
						// or John.addPlotIntoGarden(g1, new Flowerbed());
					} else if(fileLines.get(i).charAt(j) == 'O') {
						g1.addIntoGarden(new Orchard());
						// or John.addPlotIntoGarden(g1, new Orchard());
					} else {
						throw new IOException("Wrong symbol in the file. Only F and O allowed.");
					}
				}
			}
		} catch(InvalidPathException e1) {
			e1.printStackTrace();
		} catch(IOException e2) {
			e2.printStackTrace();
		}
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String command = null;
        try {
        	System.out.println("The gardener has entered the garden.\nGarden:");
        	John.admirePlants(g1);
        	System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants) | L(ook at garden) | Q(uit) ");
            while ((command = in.readLine()) != null && !command.equals("Q")) {
                executeTheCommand(command, John, g1);
                System.out.println("Enter command: P(lant)[Plant type] - e.g. PO to (P)lant an (O)ak | W(ater plants) | L(ook at garden) | Q(uit) ");
            }
        } catch (IOException ioe) {
            System.out.println("Greška u èitanju podataka.");
        }
	}
}
