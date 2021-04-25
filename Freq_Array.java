import java.util.*;
/*Write a program to find the frequency of each element in a given array.
Input: 5 1 7 4 4 1        // first number is the size of array and remaining elements are the array elements
Output: 1-2 7-1 4-2    // display in pair -> array element:it's frequency */
public class Freq_Array{ 
    public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n]; 
        int[] fr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt(); 
        int visited=-1;
        for(int i=0; i<arr.length; i++){
            int count=1; 
            for(int j=i+1; j<arr.length; j++){ 
                if(arr[i]==arr[j]){ 
                    count++; 
                    fr[j]=visited; 
                }
            } 
            if(fr[i]!=visited) 
                fr[i]=count;
        } 
        for(int i=0; i<fr.length; i++){ 
            if(fr[i]!=visited)
                System.out.print(arr[i]+"-"+fr[i]+" "); 
		} 
    } 
}

//Algorithm to find frequency of each element of an array.
//=========================================================
//STEP 1: START
//STEP 2: INITIALIZE arr[] ={1, 7, 4, 4, 1 }.
//STEP 3: CREATE fr[] of arr[] length.
//STEP 4: SET visited = -1.
//STEP 5: REPEAT STEP 6 to STEP 9 for(i=0;i<arr.length;i++)
//STEP 6: SET count = 1
//STEP 7: REPEAT STEP 8 for(j=i+1;j<arr.length;j++)
//STEP 8: if(arr[i]==arr[j]) then
//           count++
//           fr[j] =visited
//STEP 9: if(fr[i]!=visited) then
//STEP 10: fr[i]=count
//STEP 11: REPEAT STEP 12 for(i=0;i<fr.length;i++)
//STEP 12: if(fr[i]!=visited) then
//STEP 13: PRINT arr[i] and fr[i]
//STEP 14: END
//==========================================================
