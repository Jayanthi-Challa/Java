import java.util.*;
/*Write a java program to check whether a number is divisible by 7 and 13 using if-else statement.
Input: read an integer
output: display either True or False*/
public class Divisible_ifelse{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		if(a%7==0&&a%13==0){
			System.out.println("True");
		}
		else{
			System.out.println("False");
		}
	}
}
