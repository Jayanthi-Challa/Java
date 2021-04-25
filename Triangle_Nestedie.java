import java.util.*;
/*Given the sides of a triangle, write a java program to check whether the triangle is valid or not using nested if else statements.
Input :  read three integers 
Output : Display either Valid triangle or Invalid triangle*/
public class Triangle_Nestedie{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a=18, b=10, c=28;
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a+b<=c||a+c<=b||b+c<=a)
			System.out.println("Invalid triangle");
		else
			System.out.println("Valid triangle");
	}
}
