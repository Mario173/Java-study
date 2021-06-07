package hr.vestigo.java.tecaj.exceptions;

@SuppressWarnings("serial")
public class SpaceOccupiedException extends Exception {
	public String message;
	
	public SpaceOccupiedException() {
		this.message = "That space is already taken!";
	}
}
