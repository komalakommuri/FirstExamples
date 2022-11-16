package CustomExceptions;

public class FileAlreadyExisted extends Exception{
	public FileAlreadyExisted(String fileAlreadyExistedMessage)
	{
		super(fileAlreadyExistedMessage);
		System.out.println("File with same name aready existed");
	}

}
