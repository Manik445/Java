import java.util.*;
public class diamondpattern {
        public static void main(String args[]) {
            Scanner sc= new Scanner(System.in); 
            int n = sc.nextInt(); 
            // upper half 
            for(int i=1 ; i<=n; i++){
                // spaces 
                for(int j = 1 ; j<= 2*(n-i) ; j++){
                    System.out.print(" ");
                }
                // stars 
                for(int k=1 ; k<=(2*i)-1 ; k++){
                    System.out.print("*"+" ");
                }
                System.out.println();
            }

            // printing the lower half 
            for(int i =n ; i>=1 ; i--){
                // printing the spaces 
                for(int j=1 ; j<=2*(n-i) ; j++){
                    System.out.print(" ");
                }
                // printing star
                for(int k=1 ; k<=(2*i)-1 ; k++){
                    System.out.print( "*" + " ");
                }
                System.out.println();
            }
        }    
}    
