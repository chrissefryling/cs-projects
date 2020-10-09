/**Yasmine Pourarian
 * CS 111-002
 * Assignment 3
**/
	import java.util.*;
	public class ArrayListPractice {
		public static void main(String[] args) {
			//For problem 4 (toward end of class)
			ArrayList<Integer> array2 =new ArrayList<Integer>();
			int [] array = {1,2,3,4,4,5,6,2,3,0,1,0};
			for(int a=0;a<array.length;a++){
				array2.add(array[a]);
			}
			toString(removeDuplicates(array2));
			//Problem two
			ArrayList<Integer> pal =new ArrayList<Integer>();
			int small=0;
			int large = 0;
			int sum = 0;
			Random rand;
			int number;
			//10 random numbers
			for (int n = 0; n<10; n++){
				rand = new Random();
				number = rand.nextInt(10);
				pal.add(number);
				}
			System.out.println("\nProblem Two Orginial: " + pal.toString());
			//even index
			System.out.println("Problem Two Even index: ");
			for (int n = 0; n<10; n=n+2){
				System.out.print(pal.get(n)+ " ");
				}
			System.out.println("\nProblem Two Even element: ");
			//every even element
			for (int n = 0; n<10; n++){
				if (pal.get(n)%2 == 0)
				System.out.print(pal.get(n) + " ");
				}
			System.out.println("\nProblem Two Reverse order: ");
			//reverse order
			for (int n = 9; n>=0; n--){
				rand = new Random();
				System.out.print(pal.get(n) + " ");
				}
			//smallest element
			small = pal.get(0);
			for(int n= 0; n<9; n++){
				if (small > pal.get(n+1)){
					small = pal.get(n+1);
				}
			}
			System.out.println("\nProblem Two Smallest element: " + small);
			
			//largest element
			large = pal.get(0);
			for(int n =0; n<9; n++){
				if(large < pal.get(n+1)){
					large = pal.get(n+1);
				}
			}
			System.out.println("Problem Two Largest element: "+ large);
			//average 
			for(int n=0; n<10; n++){
				sum = pal.get(n) + sum;
			}
			System.out.println("Problem Two Average of elements: " + sum/pal.size());
			{
			}
		}
	
//Problem 4
public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> array){
int size = array.size();
int temp = 0;
	for(int n = 0; n< array.size(); n++){
		temp = array.get(n);
	{
			for(int i = n+1; i< size; i++){
				if (temp == array.get(i)){
						size--;
						for(int y=i+1;y<array.size();y++){
							array.set(y-1,array.get(y));}
					}
				}
			}
	     }
	ArrayList<Integer> array1 =new ArrayList<Integer>();
	for(int k=0; k< size; k++){
	array1.add(k,array.get(k));}
	return array1;}

public static void toString(ArrayList<Integer> array){
System.out.println("Problem Four, Removing Duplicates: ");
for(int r=0; r< array.size(); r++){
	System.out.print(array.get(r) + " " );
	
	}
}	
}



			
			
			
		


