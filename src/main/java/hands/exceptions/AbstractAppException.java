package hands.exceptions;

public abstract class AbstractAppException extends Exception  {
	public AbstractAppException() {
	}
	
	public AbstractAppException(String message) {
		super(message);
	}
}
