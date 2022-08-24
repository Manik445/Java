import java.util.*;
public class butterfly {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows"); 
            int n =  sc.nextInt(); 
            // printing the first half of the butterfly
             for(int i=1 ; i<=n ; i++){
                 for(int m=1 ; m<=i ; m++){
                    System.out.print("*");
                 }
                for(int j=1 ; j<=2*(n-i) ; j++){ 
                 System.out.print(" ");
                }     
                for(int p =1 ; p<=i ; p++){   
                    System.out.print("*");
                }
                System.out.println();
             }   
           // lower butterfly 
           for(int i = n ; i>=1 ; i--){
            // printing the stars 
             for(int m=i ; m>=1 ; m--){
                System.out.print("*");
           }     
           // printing spaces 
        for(int j = 2*(n-i) ; j>=1 ; j--){
            System.out.print(" ");    
        }  
        // printing the stars again 
        for(int p = i ; p>=1 ; p--){
            System.out.print("*");
        }
        System.out.println();
           }

        }
}
