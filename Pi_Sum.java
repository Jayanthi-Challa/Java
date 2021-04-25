import java.util.*;
/*Given a input X (between 1-10) and pi=3.1415926535, find the sum of all digits after decimal point upto X in pi value. Example
   X=4, output = 11 */
public class Pi_Sum{
	public static void main(String args[]){
		int[] pi={1,4,1,5,9,2,6,5,3,5};
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int sum=0;
		for(int i=0; i<x; i++){
			sum=sum+pi[i];
		}
		System.out.println(sum);
	} 
 }
