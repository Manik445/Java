import java.util.*;
public class traingle {
    public static void main(String args[]) {    
        Scanner sc = new Scanner(System.in); 
        int row = sc.nextInt(); 
        int num = 0; 
        // if row + col == evenn print  1 else print 0     
        for(int i =1 ; i<=row ; i++){
            for(int j = 1 ; j <=i ; j++){ 
                  num = i+j; 
                if(num%2==0){  
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
            }
            System.out.println();
        }
    }
}      
               