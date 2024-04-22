package model;

/**
 * Class  representing a galaxy
 * @author avillota
 * @version 1.0
 * @since 2024-04-17
 */

public class Galaxy {
	
	public final static int MAX_PHOTOS= 30;
	public final static int MAX_PLANETS= 1000;
	
	//Attributes
	private String name;
	private double distance;
	
	//Associations
	private GalaxyShape shape;

	
	public Galaxy(String name, double distance) {
		this.name = name;
		this.distance = distance;
	}
	
	
	

}
