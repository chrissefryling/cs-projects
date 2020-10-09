import java.util.*;
import java.io.*;

public class AsciiArtEditor 
{
	public static void main(String[] args)
	{
		Scanner user = new Scanner(System.in);
		System.out.println("What is the filename?");
		String filename = user.nextLine();
		System.out.println("What is the number of rows?");
		int rows = user.nextInt();
		System.out.println("What is the number of columns?");
		int cols = user.nextInt();
		AsciiArt art = new AsciiArt(filename,rows,cols);
		
	}

}
