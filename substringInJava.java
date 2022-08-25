import java.util.*;
public class substringInJava {
    public static void main(String args[]) {
    String name  = "manikGupta"; 
    System.out.println(name.substring(0, 5)); // 5 is not caluculated (0->4)
    System.out.print(name.substring(5)); // ending is by default the length of string 
    }
}
  