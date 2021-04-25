//Write java code to display odd number that is divisble by 3.
import java.util.*;
public class Odd_Div3{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1; i<n; i++){
			if(i%2!=0 && i%3==0)
				System.out.print(i+" ");
		}
	}
}
