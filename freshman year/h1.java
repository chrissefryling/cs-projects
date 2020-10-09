package homework;

public class h1 {
	
	public static int Acker( int m, int n) 
	{
		int result;

		if ( m ==0)  result = n + 1;
		else   if ( n == 0) result = Acker( m -1, 1);
		else result = Acker( m - 1,  Acker (m, n-1));

		return result;
	}
	
	public static void main(String[] args)
	{
		System.out.println(Acker(2,1));
	}

}
