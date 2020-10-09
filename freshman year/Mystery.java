
public class Mystery {
	
	public static void main(String[] args)
	{
		System.out.println(mystery(6));
	}
	
	public static String mystery(int n) 
	{
		if (n <= 0) return "";
		
	return (n + mystery(n-2) + n);
	} 

}
