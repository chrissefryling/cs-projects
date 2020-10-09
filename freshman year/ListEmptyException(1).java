/** This exception runs if the list is empty.
 * @author Christine Fryling
 **/
public class ListEmptyException extends Throwable
{   
	private static final long serialVersionUID = 1L;
	private String message;
	
    public ListEmptyException(String m)
    {
        message = m;
    }  
    public String getMessage()
    {
        return message;
    }
}
