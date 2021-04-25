/*Write a java program to read 2D array of nxn size (n rows and n columns) and print the sum of diagonal elements.
Input: 3 1 2 3 4 5 6 7 8 9   // first element is n, remaining are elements of nxn matrix storing from left to right, top to bottom.
Input matrix would be as below.
1 2 3
4 5 6
7 8 9
Output: 15 */
import java.util.*;
public class Sd_nxn{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int i,j,n,sum=0;
        n=sc.nextInt();
		int[][] mat = new int[n][n];
        for(i=0;i<n;i++){ 
            for(j=0;j<n;j++){ 
                mat[i][j] = sc.nextInt();
            }
        }
		for(i=0;i<n;i++){ 
            for(j=0;j<n;j++){ 
                if(i==j){ 
                    sum = sum + mat[i][j];
                }
            }
        }
        System.out.print(sum);
	}
}
//algorithm to find sum of diagonal elements of 2D array.
//=========================================================
//STEP-1: START
//STEP-2: INITIALIZE i,j,n,sum,mat[][].
//STEP-3: REPEAT STEPS UNTIL i<n and j<n by using for loop.
//STEP-4: DEFINE mat[i][j].
//STEP-5: if(i==j) then
//STEP-6: DECLARE sum.
//STEP-7: PRINT sum.
//STEP-8: STOP.
//=========================================================
