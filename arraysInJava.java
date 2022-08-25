import java.util.*;

public class arraysInJava {
    public static void main(String args[]) {
    
    // intaialising a new array 
    Scanner sc = new Scanner(System.in);   
    System.out.println("Enter the size of array"); 
    int s = sc.nextInt();  
    int[] arr = new int[s];  
    int n = arr.length; 

    for(int i=0 ; i<n ; i++){
        int inp = sc.nextInt(); 
        arr[i] = inp ; 
    }
   // printing the array
   for(int j =0 ; j<n ; j++){
    System.out.print(arr[j]+" ");   
   }
  }
}
 // the other form for array is 
int marrks[] = new int[size]; 