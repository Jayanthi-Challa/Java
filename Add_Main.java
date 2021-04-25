import java.util.*;
/*Write a java program to obtain two numbers and pass them to a function "add", in which sum up them and return to main function and display.
Input: 4 3
Output: 7*/
public class Add_Main{
	int add(){
		Scanner s=new Scanner(System.in);
		int num1, num2, sum;
		num1=s.nextInt();
		num2=s.nextInt();
		sum=num1+num2;
		return sum;
	}
	public static void main(String args[]){
        Add_Main sc=new Add_Main();
        int value=sc.add();
        System.out.println(value);		
	}
}


