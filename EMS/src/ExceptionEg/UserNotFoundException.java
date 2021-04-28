package ExceptionEg;

public class UserNotFoundException extends Exception{
	public UserNotFoundException()
	{
		//System.out.println("From User Not Found Exception Constructor");
	}
	public String toString()
	{
		return "User Not Found. Plz check the Credential";
	}
}