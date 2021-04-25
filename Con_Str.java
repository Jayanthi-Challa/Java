/*Finding number of characters except vowels in a given string literal.
input: hello
output: 3*/
import java.util.*;
public class Con_Str{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
        String c=s.nextLine();
        int vcount=0;
        char z[]=new char [c.length()];
        for(int i=0; i<c.length(); i++){
            z[i]=c.charAt(i);
        }
        for(int i=0; i<c.length(); i++){
			if(z[i]=='a'||z[i]=='e'||z[i]=='i'||z[i]=='o'||z[i]=='u')
				vcount++;
        }
        System.out.println(c.length()-vcount);
	}
}
//algorithm to find number of consonents in a given string literal.
//====================================================================
//STEP 1: START
//STEP 2: SET vcount =0.
//STEP 3: DEFINE string c=s.nextLine().
//STEP 4: SET i =0.
//STEP 5: REPEAT STEP 5 to STEP 6 UNTIL i<c.length()
//STEP 6: IF any character of c matches with any vowel then. ...
//        vcount = vcount =+1.
//STEP 7: i = i + 1
//STEP 8: PRINT c.length()-vcount.
//STEP 9: STOP.
//====================================================================
