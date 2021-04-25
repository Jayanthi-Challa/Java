import java.util.*;
/*Write a java program to reverse the given four digit number.
input: 2581
output: 1852*/
public class Digits_Reverse{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int num, t1, t2, t3, t4, result;
		num=s.nextInt(); 
		
		t1=num%10;
		t2=(num/10)%10;
		t3=(num/100)%10;
		t4=num/1000; 
		result=t1*1000+t2*100+t3*10+t4;
		System.out.println(result);
	}
}

//algorithm
//==========================
//step1: read a four digit number
//step2: get the fourth digit=> t1=1284=>1284%10=>4
//step3: get the third digit => t2=1284 => 1284/10=>128%10=8
//step4: get the second digit => t3=1284 => 1284/100=>12%10=2
//step5: get the first digit => t4=1284 => 1284/1000=1
