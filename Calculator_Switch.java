import java.util.*;
/*Write a java program to create a simple calculator for addition, subtraction, multiplication, division, and modulo using switch case statements.
input: read an operator (+ or - or * or / or %) first and then two integers.
output: must be integer.
For example:
input: + 4 9
output: 13*/
public class Calculator_Switch{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
        char c;
        int n1=4, n2=9, result;
        c=s.next().charAt(0);
        n1=s.nextInt();
		n2=s.nextInt();
		switch(c){
			case '+':
			    result=n1+n2;
				System.out.println(result);
				break;
			case '-':
			    result=n1-n2;
				System.out.println(result);
				break;
			case '*':
			    result=n1*n2;
				System.out.println(result);
				break;
			case '/':
			    result=n1/n2;
				System.out.println(result);
				break;
			case '%':
			    result=n1%n2;
				System.out.println(result);
				break;
			default:
			    System.out.println("Enter valid inputs");
		}
	}
}
