/* @author Christine Fryling
 * @date Sept 10
 * 
 */
public class Prob2 
{
	public static void main(String [] args)
	{
	    stars1(5,"");
	    stars2(5,"");
	}   

	public static String stars1(int n, String s)
	{
		if(n <= 0)
		{
			return "";
		}
		else
		{
			s = s + "*";
			stars1(n-1,s);
			System.out.println(s);
		}
		return s;
	}
	
	public static String stars2(int n, String s)
	{
		s = "*";
		if(n <= 0)
		{
			return "";
		}
		else
		{
			for(int i = 0; i < n; i++)
			{
				s = s + "*";
				System.out.println(s);
			}
		}
		return s;
	}
}
