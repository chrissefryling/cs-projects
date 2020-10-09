

/**
 * @author Christine Fryling
 * @date Sept 10
 *
 */
public class Prob1 
{
    public static void main(String[] args) 
    { 
    		char[] letters = { 'A', 'C', 'E', 'G'};
    		comb(letters,0);

    	}
    
    public void permutations(char[] letters, int num)
    { //num == type of variation, aka 2 letter or 3 letter
    		char[][] c = new char[letters.length *2][letters.length *2];
    		for(int i = 0; i < letters.length * 2; i++)
    		{
    			for(int k = 0; k < letters.length * 2; k++)
    			{
    				c[i][k] = letters[i];
    			}
    		}
    }

    public static void comb(char[] letters, int seq) 
    {
        if(seq == 0)
        {
        		System.out.println("The one-element sequences are: ");
        		for(int i = 0; i < letters.length; i++)
        		{
        			System.out.print(letters[i] + " ");
        		}
        		System.out.println("");
        		comb(letters,1);
        }
        else if(seq == 1)
        {
        		System.out.println("The two-element sequences are: ");
        		for(int i = 0; i < letters.length*2; i++)
        		{
        			
        		}
        		System.out.println("");
        		comb(letters,2);
        }
        else if(seq == 2)
        {
        		System.out.println("The three-element sequences are: ");
        		System.out.println("");
        		comb(letters,3);
        }
        else if(seq ==3)
        {
        		System.out.println("The four-element sequences are: ");
        	
        }
    }
}
