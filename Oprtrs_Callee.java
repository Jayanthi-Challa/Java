import java.util.*;
/*Write a java program to develop a simple calculator by creating function for addition, subtraction, multiplication, division, and modulo. Call these functios 
using switch case statements based on the match of operator. Then, return the output to main function and display it.
input: read an operator (+ or - or * or / or %) first and then two integers. Based on the operator call respective function.
output: must be integer.
For example:
input: + 4 9
output: 13*/
public class Oprtrs_Callee{
	int operators(){
		Scanner s=new Scanner(System.in);
		char operator=s.next().charAt(0);
		int a=s.nextInt();
		int b=s.nextInt();
		int result=0;
		switch(operator){
			case '+':
			    result=a+b;
				break;
			case '-':
			    result=a-b;
				break;
			case '*':
			    result=a*b;
				break;
			case '/':
			    result=a/b;
				break;
			case '%':
			    result=a%b;
				break;
		}
		return result;
	}
	public static void main(String args[]){
		Oprtrs_Callee sc=new Oprtrs_Callee();
		int value=sc.operators();
		System.out.println(value);
	}
}

//algorithm.
//===============================================
//Start 
//Declare variables a, b, result.
//Read result=0.
//Take switch statement --> switch(expression).
//Declare case statements.
//Values must be of same type of expression.
//Use break for all statements(break is optional).
//We can have any number of case statements.
//It take statement from the case which is true.
//return statement below --> return result.
//Take value=sc.operators.
//Print value.
//Stop.
//=================================================
