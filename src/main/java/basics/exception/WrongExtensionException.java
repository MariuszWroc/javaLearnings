package basics.exception;

public class WrongExtensionException extends Exception{

	private static final long serialVersionUID = 1L;

	public WrongExtensionException(String errorMessage) {
        super(errorMessage);
    }
}
