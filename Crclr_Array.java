/*Consider a circular array of n elements, which means that two ends of an array are connected. Now, rotate each element of an array n times to the right.
 For example,
Input: 5 2 1 2 3 4 5     // first number is the size array, second number is number of shifts, and remaining elements are the array elements.
Output: 4 5 1 2 3*/
import java.util.*;
public class Crclr_Array{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int arr[], n, s, i, j, last;
		n=sc.nextInt();
		s=sc.nextInt();
		arr=new int[n];
		for(i=0; i<n; i++)
			arr[i]=sc.nextInt();
		for(i=0; i<s; i++){
			last=arr[n-1];
			for(j=n-1; j>0; j--){
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
		for(i=0; i<n; i++)
			System.out.print(arr[i]+" ");
	}
}

//Algorithm to find circular array of n elements
//===============================================
//STEP-1: START
//STEP-2: INITIALIZE arr[], n, s, i, j, last.
//STEP-3: REPEAT UNTIL i<n
              //for(i=0; i<n; i++)
//STEP-4: REPEAT STEP 5 to STEP 9 UNTIL i<s
              // for(i=0; i<s; i++ )
//STEP-5: DEFINE j, last.
//STEP-6: last = arr[n-1]
//STEP-7: REPEAT STEP 8 UNTIL j>0
              //for(j= n-1;j>0; j--)
//STEP-8: arr[j]= arr[j-1]
//STEP-9: arr[0]= last
//STEP-10: REPEAT STEP 11 UNTIL i<n
              //for(i=0; i<n; i++)
//STEP-11: PRINT arr[i]
//STEP-12: END
//==================================================

