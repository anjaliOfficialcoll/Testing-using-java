import java.util.Scanner;
public class Array{

    public static void main(String [] args){
       
       Scanner sc= new Scanner(System.in);
       int n= sc.nextInt();
       int [] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }

       int index=sc.nextInt();
       
       for(int i=0;i<n; i++){
          
           if(index<0||index>n){
               System.out.print(-1);
               break;
           }else if(arr[i]==index){
                 System.out.print(arr[i]);
                 break;
               }
       


       }
       
      
   
    





}


}