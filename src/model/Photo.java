package model;

import java.util.Date;

/**
 * Class  representing a photo
 * @author avillota
 * @version 1.0
 * @since 2024-04-17
 */


public class Photo {
	
	private String url;
	private String takenBy;
	private Date dateTaken;

	
	public Photo(String url, String takenBy, Date dateTaken) {
		this.url = url;
		this.takenBy = takenBy;
		this.dateTaken = dateTaken;
	}

	/**
	 * Method that generates a string with the photo's data
	 */
	public String toString() {
		
		return "Pic info: " + url + "\n" + takenBy + "\n"  + dateTaken.toString();
	}
	
	
	

}
