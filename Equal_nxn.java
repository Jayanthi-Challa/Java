/*Write a Java program to determine whether elements of two matrices are equal.
Example:1
Input: 3 4 2 3 6 2 3 8 7 2 8 1 3 2 5 4 3 2 1  // first element is n, next nxn elements are matrix A, remaining nxn elements are matrix B.
    A=
      4 2 3
      6 2 3
      8 7 2
    B=
      8 1 3
      2 5 4
      3 2 1
Output: false                    // if all elements are not equal, display false.

Example:2
Input: 3 1 2 3 4 5 6 7 8 9 1 2 3 4 5 6 7 8 9  // first element is n, next nxn elements are matrix A, remaining nxn elements are matrix B.
    A= 
      1 2 3
      4 5 6
      7 8 9
    B=
      1 2 3
      4 5 6
      7 8 9
Output: true                   // if all elements are equal, display true.*/
import java.util.*;
public class Equal_nxn{
    public static void main(String ar[]) {  
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int A[][]=new int[n][n];
    int B[][]=new int[n][n];
    int count=0;
    boolean flag=false;
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
            if(A[i][j]==B[i][j]){
                flag=true;
                count++;
            }
        }
    }
    if(count==n*n)
        System.out.println("true");
    else
        System.out.println("false");
    }
}
//algorithm to find elements of two matrices are equal.
//=========================================================
//STEP-1: START
//STEP-2: INITIALIZE n, A[][], B[][], count, flag, i, j.
//STEP-3: REPEAT STEPS UNTIL i<n and j<n by using for loop.
//STEP-4: DEFINE A[i][j] and B[i][j].
//STEP-5: TAKE if condition to DECLARE flag and count++.
//STEP-6: if(count==n*n) then 
//STEP-7: PRINT true.
//STEP-8: else 
//STEP-9: PRINT false.
//STEP-10: STOP.
//=========================================================

