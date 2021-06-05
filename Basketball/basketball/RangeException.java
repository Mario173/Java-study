package basketball;

@SuppressWarnings("serial")
public class RangeException extends Exception {
	String message;
	
	RangeException(String attributeOutOfRange, int lowerLimit, int higherLimit) {
		this.message = new String("Attribute " + attributeOutOfRange + " is out of range (allowed values"
				+ " are between " + lowerLimit + " and " + higherLimit + ")");
	}
}
