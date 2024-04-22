package model;


/**
 * Class  representing the controller for the astronomy application 
 * @author avillota
 * @version 1.0
 * @since 2024-04-17
 */
public class AstronomyController {
	
	public final static int MAX_GALAX= 50;
	private Galaxy[] galaxies;
	
	public AstronomyController() {
		galaxies= new Galaxy[MAX_GALAX];
	}
	

	/**
	 * Method for show all the information of a galaxy
	 * this method is associated to  RF2
	 * PRE: the array galaxies is initialized
	 * @param name is the name of the galaxy
	 * @return a string with all the galaxy info including its attributes and photos 
	 */
	public String  showGalaxyFullInfo(String name){
		String msg ="mensaje con el resultado de mostrar toda la información de una galaxia";
		
		return msg;
		
	}


	/**
	 * Method for create a galaxy, associated to RF1
	 * The  name of the galaxy cannot exists previously 
	 * PRE: the array galaxies is initialized
	 * @param name is the name of the galaxy
	 * @param distance is the distance in light years
	 * @return a message 
	 */
	public String createGalaxy(String name, double distance) {
		String msg ="mensaje con el resultado de crear una galaxia";
		
		return msg;
	}

}
