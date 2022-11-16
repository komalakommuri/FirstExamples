package CustomExceptions;

public class CustomFileNotFoundException extends Exception{

	private static final long serialVersionUID = 1L;

	public  CustomFileNotFoundException(String exceptionMessage) {
		super(exceptionMessage);
		System.out.println("File Not Found - Custome Message");
	}
}
