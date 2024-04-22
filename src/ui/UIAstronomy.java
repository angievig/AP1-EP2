package ui;

import java.util.Scanner;
import model.AstronomyController;

/**
 * Main Class for the astronomy application 
 * @author avillota
 * @version 1.0
 * @since 2024-04-17
 */
public class UIAstronomy {
	
	/**
	 * Object for reading the input
	 */
	private Scanner sc;
	/**
	 * Object representing the association with the controller
	 */
	private AstronomyController astronomyC;
	
	/**
	 * Constructor Method, initializes the objects (scanner and controller)
	 */
	public UIAstronomy() {
		sc= new Scanner(System.in);
		astronomyC = new AstronomyController();
	}
	

	/**
	 * Main method starts the application's execution 
	 * @param args
	 */
	public static void main(String[] args) {
		
		UIAstronomy obj= new UIAstronomy();
		System.out.println("Iniciando la aplicación");
		
		int option=0;
		
		do{
			option= obj.showMenu();
			obj.executeOperation(option);
		}while (option!=0);

	}
	
	
	/**
	 * 
	 * @return
	 */
	public int showMenu() {
		int option=0;

		System.out.println(
				"Menú principal, seleccione una opción\n" +
				"(1) Para crear un grupo de galaxias \n" +
				"(2) Para mostrar la información de todos los grupos registrados\n" +
				"(3) Para mostrar el grupo con mayor diámetro \n" +
				"(4) Bonus\n"+
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}
	/**
	 * 
	 * @param operation
	 */
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1: rf1CrearGalaxia();
			break;
		case 2: rf2ConsultarGalaxia();
			break;
		case 3: rf3RegistrarPlaneta();
			break;
	
		case 4: rf4MostrarGalaxias();
			break;
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

	public void rf1CrearGalaxia() {
		System.out.println("Crear una galaxia");

	}
	
	public void rf2ConsultarGalaxia() {
		System.out.println("Operación del RF2");
	}


	public void rf4MostrarGalaxias() {
		System.out.println("Operación del RF3");
	}


	public void rf3RegistrarPlaneta() {
		System.out.println("Operación del RF4");
	}







}
