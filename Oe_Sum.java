import java.util.*;
/* Given a 4 digit number, write a java program to calculate the sum of digits in the odd place and sum of digits in the even place separately. Observe odd and 
even locations from right to left of the given 4 digit number.
input: 2581
output: 6 10 */
public class Oe_Sum{
	public static void main(String args[]){
		//for user input
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		//declare variables we need
		int num1=0, num2=0, r=0;
		for(int m=n, i=1; m!=0; i++, m=m/10){
			//for changing no.of digits
			r=m%10;
			//to check number is even or odd
			if(i%2!=0) //then it is odd
			    num1=num1+r;
			else
				num2=num2+r;
		}
		System.out.println(num1+" "+num2);
	}
}




/* or we can take like this also without using for and if else loops.
int t1=1, t2=8, t3=5, t4=2;
t1+t3=6, t2+t4=10;
System.out.println((t1+t3)+" "+(t2+t4)); */
