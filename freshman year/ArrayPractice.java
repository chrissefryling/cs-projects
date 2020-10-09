/**Yasmine Pourarian
 * CS 111-002
 * Assignment 3
 **/
import java.util.*;
public class ArrayPractice {
	public static void main(String[] args) {
		//For Problem 3 (toward end of class)
				int [] array2 = {1,2,3,4,4,5,6,2,3,0,1,0};
				toString(removeDuplicates(array2));
		//Problem one
		Random number = null;
		int[] array = new int[10];
		int small=0;
		int large = 0;
		int sum = 0;
		//10 random numbers
		System.out.println("\nProblem One Original: ");
		for (int n = 0; n<10; n++){
			number = new Random();
			array[n]= number.nextInt(10);
			System.out.print(array[n] + " ");
			}
		System.out.println("\nProblem One Even index: ");
		//even index
		for (int n = 0; n<10; n=n+2){
			System.out.print(array[n] + " ");
			}
		System.out.println("\nProblem One Even Element: ");
		//every even element
		for (int n = 0; n<10; n++){
			if (array[n]%2 == 0)
				System.out.print(array[n] + " ");
			}
		System.out.print("\nProblem One Reverse order: ");
		//reverse order
		for (int n = 9; n>=0; n--){
			number = new Random();
			System.out.print(array[n] + " ");
			}
		//smallest element
		small = array[0];
		for(int n= 0; n<9; n++){
			if (small > array[n+1]){
				small = array[n+1];
			}
		}
		System.out.println("\nProblem One Smallest element: " + small);
		//largest element
		large = array [0];
		for(int n =0; n<9; n++){
			if(large < array[n+1]){
				large = array[n+1];
			}
		}
		System.out.println("Problem One Largest element: " + large);
		//average 
		for(int n=0; n<10; n++){
			sum = array[n] + sum;
		}
		System.out.println("Problem One Average of elements: " + sum/array.length);
		{
		}
	}

//Problem 3
public static int[] removeDuplicates(int[] array){
	int size = array.length;
	int temp = 0;
	
		for(int n = 0; n< array.length-1; n++){
			temp = array[n];
		{
				for(int i = n+1; i< size; i++){
					if (temp == array[i]){
							size--;
							for(int y=i+1;y<array.length;y++){
								array[y-1]=array[y];}
						}
					}
				}
		     }
		
		int [] array1 = new int[size];
		for(int k=0; k< size; k++){
		array1[k] = array[k];}
		return array1;}

public static void toString(int[] array){
	System.out.println("Problem Three, Removing Duplicates from array: ");
	for(int r=0; r< array.length; r++){
		System.out.print(array[r] + " " );
		
		}
	}	

}

	
		
		
		
	


