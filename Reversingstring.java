import java.util.*;
public class Reversingstring {
    public static void main(String args[]) {
            StringBuilder sb =  new StringBuilder("manik"); 
            for(int i = 0 ; i<sb.length()/2 ; i++){
                int first = i ; 
                int last = sb.length()-1-i ; 

                char front = sb.charAt(first); 
                char back = sb.charAt(last); 
   
                // swapping  
                sb.setCharAt(front,back);      
                sb.setCharAt(back,front); 
            }
            System.out.println(sb);
    }
}
