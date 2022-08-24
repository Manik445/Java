import java.util.*;
public class wordPry {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in); 
            int n = sc.nextInt(); 
             for(int i=1 ; i<=n ;i++){
                // spaces 
                for(int j=1 ; j<=(n-i) ;j++){
                    System.out.print(" ");
                }
                for(int m=1; m<=i ; m++){
                    System.out.print(" "+i+" ");
                }
                System.out.println();
             }

        }
}
