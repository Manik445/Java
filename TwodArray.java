import java.util.*;
public class TwodArray {
        public static void main(String args[]) {
                Scanner sc= new Scanner(System.in); 
                int row = sc.nextInt();
                int col = sc.nextInt(); 
                int arr[][] = new int[row][col]; 
                
                // intilalising the 2-d array 
                for(int i=0 ; i<row ; i++){
                        for(int j =0 ; j<col ; j++){
                                int inp = sc.nextInt(); 
                              arr[i][j] = inp; 
                        }
                }
                for(int i=0 ; i<row ; i++){
                        for(int j=0 ; j<col ; j++){
                               System.out.print(arr[i][j]);
                        }
                        System.out.println();
                }

                // searching for a number given by the user
                 int tofind = sc.nextInt(); 
                 for(int i=0 ; i<row ; i++){
                        for(int j=0 ; j<col ; j++){
                                if(arr[i][j]==tofind){
                                        System.out.print("number found at index" + " " + i +  " , " + j );    
                                }
                        }
                }
        }
}

