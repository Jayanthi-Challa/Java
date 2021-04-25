import java.util.*;
/*Write a program to sum the first ‘n’ terms of the Fibonacci series (0 1 1 2 3 5 8 13...). Example, n=5 output=7 */
public class Fibonacci{
    public static void main(String args[]){
	    Scanner s=new Scanner(System.in);
		int sum=0;
		int n=s.nextInt();
		int t1=0, t2=0, t3=1;
		for(int i=1; i<=n-1; i++){
			sum+=t3;
			t1=t2;
			t2=t3;
			t3=t1+t2;
		}
		System.out.println(sum);
	}
}
