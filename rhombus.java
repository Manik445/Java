import java.util.*;
public class rhombus {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
         int n = sc.nextInt(); 

         // for rows 
         for(int i = 1 ; i<=n ; i++){    
            // printing spaces 
            for(int j=1 ; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int m=1 ; m<=n; m++){
                System.out.print("*");
            }
            // printing the spaces 
            for(int p=1 ; p<i; p++){ 
                System.out.print(" ");
            }
            System.out.println();
         }
    }
}
