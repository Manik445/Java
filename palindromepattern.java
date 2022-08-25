import java.util.*;
public class palindromepattern {
        public static void main(String args[]) {
            Scanner sc= new Scanner(System.in); 
            int n = sc.nextInt(); 
               // rows 
            for(int i = 1 ; i<=n ; i++){
                // spaces 
                for(int j=1 ; j<=(n-i) ; j++){
                    System.out.print(" ");
                }
                for(int m =i ; m>=1 ; m--){
                    System.out.print(" "+ m + " ");
                }
               // right numbers 
               for(int p=2 ; p<=i; p++){
                System.out.print(" "+ p + " ");
               }   
               System.out.println();
            }
        }
}
