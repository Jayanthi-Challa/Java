import java.util.*;
/*Write a java program to calculate the sum of all odd numbers from 1 to n using do-while loop.
input: read an integer
output: display an integer*/
public class Odd_Sum{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		int sum=0;
		do{
			if(i%2==1){
				sum=sum+i;
			}
			i++;
		}
		while(i<=n);
		System.out.println(sum);
	}
}






/*if they asked for forloop we want to use this logic.
    int n, i, sum=0;
		n=s.nextInt();
		for(i=0;i<n;i++){
			if(i%2==1){
				sum=sum+i;
			}
		}*/
