import java.util.*;
/*Write a program to print the sum of the prime numbers less than or equal to a given number n. For example, if the given number is 17 the sum 2+3+5+7+11+13+17
 should be calculated and 58 should be printed. */
public class Pn_Sum{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int i=0;
		int num=0;
		int sum=0;
		String primeNumbers=" ";
		int n=s.nextInt();
		s.close();
		for(i=1; i<=n; i++){
			int count=0;
			for(num=i; num>=1; i++){
				if(i%num==0){
					count=count+1;
				}
			}
			if(count==2){
				primeNumbers=primeNumbers+i+" ";
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}
