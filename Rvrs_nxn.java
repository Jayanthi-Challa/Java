/*Write a Java program to read 2D array of nxn size (n rows and n columns) and print in reverse order.
Input: 3 1 2 3 4 5 6 7 8 9   // first element is n, remaining are elements of nxn matrix storing from left to right, top to bottom.
Input matrix would be as below.
1 2 3
4 5 6
7 8 9
Output: 
9 8 7
6 5 4
3 2 1*/
import java.util.*;
public class Rvrs_nxn{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
         int A[][]=new int[n][n];
         int B[][]=new int[n][n];
         for(int i=0; i<n; i++){
             for(int j=0; j<n; j++){
                 A[i][j]=sc.nextInt();
             }
         }
         for(int i=n-1; i>=0; i--){
             for(int j=n-1; j>=0; j--){
                 B[i][j]=A[i][j];
                 System.out.print(B[i][j]);
                 if(j!=0)
                     System.out.print(" ");
             }
             System.out.println();
         }
    }
}
//algorithm to find reverse order of the 2D array.
//===========================================================
//STEP-1: START
//STEP-2: INITIALIZE n, A, B.
//STEP-3: REPEAT STEPS UNTIL i<n and j<n by using for loop.
//STEP-4: DEFINE A[i][j].
//STEP-5: REPEAT STEPS UNTIL i>=0 and j>=0 by using for loop.
//STEP-6: TAKE B[i][j]=A[i][j].
//STEP-7: PRINT B[i][j].
//STEP-8: if(j!=0) then
//STEP-9: PRINT " ".
//STEP-10: PRINT ln() for new line.
//STEP-11: STOP.
//===========================================================
