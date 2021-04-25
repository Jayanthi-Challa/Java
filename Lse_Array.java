import java.util.*;
/*Write a java program to obtain a list of n numbers into an array and find the largest and smallest element from the array.  Example:
Input: 5 3 2 1 7 4  // first number is the size array and remaining elements are the array elements
Output: 1 7           // first number is the smallest, second number is the largest in an array.*/
public class Lse_Array{
	public static void main(String args[]){
		int n, max, min, i;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		
		int[] inputArray=new int[n];
		
		for(i=0; i<n; i++){
			inputArray[i]=s.nextInt();
		}
		max = min = inputArray[0];
		
		for(i=1; i<n; i++){
			if(inputArray[i]>max)
				max=inputArray[i];
			else if(inputArray[i]<min)
				min=inputArray[i];
		}
		System.out.println(min+" "+max);
	}
}

//algorithm to find largest and smallest elements of an array.
//====================================================================================================
//Start
//Let input Array is an integer array having N elements.
//We will use two integer variable "max" and "min".
//Initialize them with first element of input array(inputArray[0]).
//Using for loop, traverse inputArray from array index 0 to N-1.
//If current element is more than max, then update max with current element.
//Else if, current element is less than min, then update min with current element.
//At the end of for loop, "max" and "min" will contain the maximum and minimum elements of inputArray.
//Stop.
//=====================================================================================================
