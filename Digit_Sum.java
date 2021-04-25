import java.util.*;
/*Given two two numbers A and B each 4 digits, find their sum. The condition is, sum up first digit in A and last digit in B, sum up second digit in A and second 
last in B, etc. Avoid following normal addition that carries value to the next position. Example    
    A=1234             
    B=7618             
    A+B=93911*/
public class Digit_Sum{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int A, B;
		int array1[]=new int[4];
		int array2[]=new int[4];
		int sum[]=new int[4];
		A=s.nextInt();
		B=s.nextInt();
		
		array1[3]=A%10;
		array1[2]=(A/10)%10;
		array1[1]=(A/100)%10;
		array1[0]=(A/1000)%10;
		
		array2[3]=B%10;
		array2[2]=(B/10)%10;
		array2[1]=(B/100)%10;
		array2[0]=(B/1000)%10;
		
		int i,j;
		for(i=0, j=3;(i<4&j>=0); i++, j--){
			sum[i]=array1[i]+array2[j];
			System.out.print(sum[i]);
		}
	}
}
