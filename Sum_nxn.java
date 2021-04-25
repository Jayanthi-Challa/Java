/*Write a Java program to read two 2D arrays (A and B) of nxn size (n rows and n columns), perform A+B, and display the output matrix.
Input: 3 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9  // first element is size n, next nxn elements are matrix A, remaining nxn elements are matrix B.
    A= 
      1 2 3
      4 5 6
      7 8 9
    B=
      1 2 3
      4 5 6
      7 8 9
Output:  
    2 4 6
    8 10 12
    14 16 18*/
import java.util.*;
public class Sum_nxn{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int A[][]=new int[n][n];
        int B[][]=new int[n][n];
		int C[][]=new int[n][n];
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				A[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				B[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				C[i][j]=A[i][j]+B[i][j];
				System.out.print(C[i][j]);
				if(j!=n-1)
                    System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
//algorithm to find the sum of two matrices of the 2D array.
//=========================================================
//STEP-1: START
//STEP-2: INITIALIZE n, A, B, C.
//STEP-3: REPEAT STEPS UNTIL i<n and j<n by using for loop.
//STEP-4: DEFINE A[i][j] and B[i][j].
//STEP-5: TAKE C[i][j]=A[i][j]+B[i][j].
//STEP-6: PRINT C[i][j].
//STEP-7: if(j!=n-1) then
//STEP-8: PRINT " ".
//STEP-9: PRINT "\n" for new line.
//STEP-10: STOP.
//=========================================================

