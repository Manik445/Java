import java.util.*; 

public class test {

public static void main(String args[]){   
    // sum of two numbers 
    Scanner sc = new Scanner(System.in);  // object class sc 
    // int a = sc.nextInt();     
    // int b = sc.nextInt(); 
    // // int sum = a + b; 
    // // System.out.println(sum);
    // if(a == b){
    //     System.out.println("a and b are same");
    // }
    // else if(a < b ){
    //     System.out.println("b is greater than a ");     // if 'if ' is true then if else is not be excuted
    // }
    // else {
    //     System.out.println("a is greater than b");
    // }
     // switch
    int button = sc.nextInt(); 
    switch(button){
        case 1 : System.out.println("hello");
        break ; 
        case 2 : System.out.println("bonjour");
        break; 
        case 3:  System.out.println("Namsate");
        break; 
        default: System.out.println("Invalid Button");

    } 

     // do while
     int i = 10 ; 
      do{  
        System.out.println("Hello and namaste");
        i++;       
      }
      while(i<10); 
        
    System.out.println("Hello World");   
    }
}