import java.util.*;


public class Set
{
	private ArrayList<Integer> set;
	
	public Set(int n)
	{
		Random rand = new Random();
		for(int i = 0; i < n; i++)
		{
			set.add(rand.nextInt(999));
		}
	}
	
	public Set(int [] array)
	{
		for(int i = 0; i < array.length; i++)
		{
			set.add(array[i]);
		}
	}
	
	public Set union(Set b) //union between the two
	{
		Set a = new Set(set.size() + b.size());
		return a;
	}
	
	public Set intersection(Set b) //intersection + b
	{
		Set a = new Set(set.size() + b.set.size());
		for(int i = 0; i < set.size(); i++)
		{
			a.set.add(set.get(i));
		}
		for(int i = 0; i < b.set.size(); i++)
		{
			a.set.add(b.set.get(i));
		}
	    return a;
	}
	
	public Set difference(Set b) //difference
	{
		for(int i = 0; i < b.size(); i++)
		{
			if(set.contains(b.set.get(i)))
			{
				set.remove(i);
			}
		}
		Set a = new Set(b.size() + set.size());
		for(int i = 0; i < set.size(); i++)
		{
			a.set.add(set.get(i));
		}
		for(int i = 0; i < b.set.size(); i++)
		{
			a.set.add(b.set.get(i));
		}
		return a;
	}
	
	public int size()
	{
		int num = 0;
		for(int i = 0; i < set.size(); i++)
		{
			num++;
		}
		return num;
	}
	
	public boolean contains(int value)
	{
		for(int i = 0; i < set.size(); i++)
		{
			if(set.get(i) == value)
			{
				return true;
			}
		}
		return false;
	}
	
	public String toString()
	{
		String str = "";
		for(int i = 0; i < set.size(); i++)
		{
			str += set.get(i) + " ";
		}
		return str;
	}
	
	public void subsetSum(int desiredSum)
	{
		Scanner user = new Scanner(System.in);
		int sum = 0;
		int position = 0;
		System.out.println("What is the desired size of the set?");
		int num = user.nextInt();
		Set sub = new Set(num);
		
		//call the method
		subsetSumHelper(desiredSum,sum,position,sub);
	}
	
	private void subsetSumHelper(int desiredSum,int sum,int position,Set subset)
	{
		if(sum == desiredSum)
		{
			System.out.println("The sum was found using: " + subset.set.get(position));
		}
		else
		{
			
		}
	}
}
