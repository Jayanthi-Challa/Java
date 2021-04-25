import java.util.*;
/*Write a java program to calculate the sum of digits of a given four digit number.
input: 2581
output: 16 */
public class Digits_Sum{
	public static void main(String args[]){		
		Scanner s = new Scanner(System.in);
		int num, t1, t2, t3, t4, sum;	
		System.out.println("enter a four digit number ");
		num=s.nextInt();
		t1=num%10;
		System.out.println("t1 value "+t1);
		t2=(num/10)%10;
		System.out.println("t2 value "+t2);
		t3=(num/100)%10;
		System.out.println("t3 value "+t3);
		t4=num/1000;
		System.out.println("t4 value "+t4);
		sum=t1+t2+t3+t4;
		System.out.println(sum);
	}
}
