import java.util.*;
public class strings {
        public static void main(String args[]){
            // for only one string to printed use next and for manik gupta full name use nextLine 
            Scanner sc = new Scanner(System.in);

            // printing only manik from manik gupta
            // String first = sc.next(); 
            // System.out.println(first); 

            // // printing the full name in main gupta
            // String full = sc.nextLine(); 
            // System.out.print(full);

            // printing every  chars in the strings 
        //     String fullName = "manik gupta"; 
        //     for(int i = 0 ; i<fullName.length() ; i++){
        //         System.out.print(fullName.charAt(i));  
        //     }
        //     System.out.println();
        // }

        // comparing the strings by compareTo function 
        String first = "manik"; 
        String second ="Gupta"; 
        if(first.compareTo(second) == 0 ){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not equal");
        }

}
}
