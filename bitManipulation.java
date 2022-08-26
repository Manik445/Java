import java.util.*;
public class bitManipulation {
    public static void main(String args[]){
        int n = 5; // 0101 
        int pos = 2 ;  
        int bitMask = n<<pos; 
        if((bitMask&n)==0){
            System.out.println("Bit is zero");
            } 
            else{
            System.out.println("bit is One");
            }   
            
            // set bit 5 -> 0101 --> 0111 ( at position 1); 
            pos = 1 ; 
            bitMask = 1<<pos; 
           int ans = bitMask|n; 
             System.out.println(ans);

            // clear bit 
           pos = 2 ; 
           bitMask= 1<<pos ; 
           int Nonbit  = ~(bitMask); 
           int an = Nonbit&n; 
           System.out.println(an);

    }    
}
