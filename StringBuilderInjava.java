import java.util.*;
public class StringBuilderInjava {
        public static void main(String args[]) {
                // // string are immutable in java 
                // // thus to make changes in strings we use the stringBuiler in java 
             
                // StringBuilder sc = new StringBuilder("manik");

                // // setting char at 
                // sc.setCharAt(0, 'p');    
                // System.out.println(sc);  

                // // insert char at an index 
                // sc.insert(0 , 'p'); 
                // System.out.println(sc);

                // // deleting chars
                // sc.delete(2,4);  
                // System.out.print(sc);

                Scanner sc= new Scanner(System.in); 
                int n = sc.nextInt();
                // reversing a string 
            String arr[] = new String[n];  
            for(int i =0 ; i<n ; i++){
                String inp = sc.next(); 
                arr[i] = inp; 
            }
            int first = 0 ;  
            int last = arr.length; 
            
            while(first < last ){
              String temp = arr[first]; 
              arr[first] = arr[last]; 
              arr[last] = temp; 
            } 

            // printing the array 
            for(int i = 0 ; i<arr.length ; i++){
                System.out.print(arr[i]);
            }

        }
}
