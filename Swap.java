import java.util.*;
//Swapping two values num1 and num2.
public class Swap{
	public static void main(String args[]){
		int num1, num2, temp;
		num1 = 5;
		num2 = 10;
		System.out.println("Before swapping: num1, num2 = "+num1+", "+num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("After swapping: num1, num2 = "+num1+", "+num2);
	}
}
