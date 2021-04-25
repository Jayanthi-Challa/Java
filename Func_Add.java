import java.util.*;
/*Write a java program to obtain two numbers and pass them to a function "add", in which sum up them and display the output.
Input: 4 3
Output: 7*/ 
public class Func_Add{
	public static void main(String args[]){
	    Calculator c=new Calculator();
		Scanner s=new Scanner(System.in);
        int sum;
        c.num1=s.nextInt();
        c.num2=s.nextInt();
        c.add();		
	}
}
class Calculator{
	int num1=4;
	int num2=3;
	void add(){
		int sum=num1+num2;
		System.out.println(sum);
	}
}                               
