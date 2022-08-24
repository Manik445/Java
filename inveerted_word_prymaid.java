import java.util.*;
public class inveerted_word_prymaid {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
        int inp =  sc.nextInt(); 
       for(int i = 1; i <=inp ; i++){
        for(int j = inp ; j>=i ; j--){
            System.out.print(j+" ");
        }
        System.out.println();
       }
    }
}
   