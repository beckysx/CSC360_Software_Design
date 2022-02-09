package payroll_system;

public class PersonNonExistException extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public PersonNonExistException()
	{
		super("Sorry, the person is not in the system yet.");
	}

	/**
	 * @param message
	 */
	public PersonNonExistException(String message)
	{
		super(message);
	}

	

}
