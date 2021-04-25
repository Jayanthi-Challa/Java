/*Write a java program to read 2D array of nxn size (n rows and n columns) and print the elements that belong to lower triangular matrix.
Input: 3 1 2 3 4 5 6 7 8 9   // first element is n, remaining are elements of nxn matrix storing from left to right, top to bottom.
Input matrix would be as below.
1 2 3
4 5 6
7 8 9
Output: 1 4 5 7 8 9 */
import java.util.*;
public class Ltm_nxn{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		n=sc.nextInt();
		int[][] A=new int[n][n];
        for(i=0; i<n; i++){
            for(j=0; j<n; j++){	
                A[i][j]=sc.nextInt();
            }			
        }
		for(i=0; i<n; i++){
			for(j=0; j<n; j++){
				if(j<=i)
                    System.out.print(A[i][j]+" ");
            }
        }
	}
}
//algorithm to find lower triangular matrix of 2D array.
//=========================================================
//STEP-1: START
//STEP-2: INITIALIZE i, j, n, A[][].
//STEP-3: REPEAT STEPS UNTIL i<n and j<n by using for loop.
//STEP-4: DEFINE A[i][j].
//STEP-5: if(j<=i) then
//STEP-6: PRINT A[i][j].
//STEP-7: STOP.
//=========================================================
