public class ArrayRecursion {
	
	public static void main(String[] args)
	{
		int [] array = {2,5,6,7,9,1,3,4,6,2,11};
		int position = array.length-1;
		
		System.out.println(countElements(array,position));
	}
	
	public static int countElements(int [] array, int position)
	{
		if(position < 0)
		{
			return 0;
		}
		else if(array[position] % 3 == 0)
		{
			return 1 + countElements(array,position-1);
		}
		else
		{
			return countElements(array, position - 1);
		}
	}

}
