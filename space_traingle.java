import java.util.*;
public class space_traingle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt(); 

        for(int i= 1 ; i<=num ; i++){
            for(int j=1; j<=num-i; j++){
                System.out.print(" ");
            }
             for(int m=0 ; m<i ; m++){
                System.out.print("*");
             }
            System.out.println();
        }     
    }
}
    