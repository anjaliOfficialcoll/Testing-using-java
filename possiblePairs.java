//TASK 5 : to print all possible pairs of elements from an array of size n



import java.util.Arrays;
import java.util.Scanner;
public class possiblePairs{

    public static void main(String [] args){
       
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       int [] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       

       for(int i=0;i<n;i++){
            for(int j=1;j<n;j++){
            System.out.print(arr[i]+","+ arr[j]);
  

            }System.out.println(" ");
           
    }

           
       

       
       
      
   
 }


}