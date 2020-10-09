/**
 * This exception runs if the data is not in the list.
 * @author Christine Fryling
 * @version nov 30
 **/
public class NotInListException extends Throwable
{
	private static final long serialVersionUID = 1L;
	private String message;
    public NotInListException(String m)
    {
        message = m;
    }   
    public String getMessage()
    {
        return message;
    }
}
