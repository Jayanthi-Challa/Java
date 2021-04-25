import java.util.*;
/*Write a java program to find the grade for given percentage of marks using if-else-if ladder.
Input: >90            Display output: A+ Grade
Input: >75 and <=90   Display output: A Grade
Input: >60 and <=75   Display output: B Grade
Input: >40 and <=60   Display output: C Grade
Input: >30 and <=40   Display output: D Grade
Input: <=30           Display output: Fail*/
public class Grade_Ieil{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int marks;
		marks=s.nextInt();
		if(marks>90)
			System.out.println("A+ Grade");
		else if(marks>75 && marks<=90)
		    System.out.println("A Grade");
		else if(marks>60 && marks<=75)
		    System.out.println("B Grade");
		else if(marks>40 && marks<=60)
		    System.out.println("C Grade");
		else if(marks>30 && marks<=40)
		    System.out.println("D Grade");
		else if(marks<=30)
		    System.out.println("Fail");
	}
}
