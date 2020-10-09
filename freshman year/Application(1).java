import java.util.*;
public class Application 
{
	public static void main(String[] args)
	{
		Scanner user = new Scanner(System.in);
		
		//MENU
		System.out.println("Welcome! MENU: ");
		System.out.println("1. Create a Cassette, CD, DVD, or VHS.");
		System.out.println("2. List all media.");
		System.out.println("3. List data for a media.");
		System.out.println("4. Look up an artist.");
		System.out.println("5. Play media.");
		System.out.println("6. Find the number of plays.");
		int choice = user.nextInt();
		
		System.out.println("Goodbye.");
	}
}
