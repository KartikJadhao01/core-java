package exception_handling;

public class InvalidPinException extends Exception{

	InvalidPinException(String message){
		super(message);
	}
}
