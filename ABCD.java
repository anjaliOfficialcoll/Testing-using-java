package day02;

public class ABCD {
     public static void main(String[] args) {
        int n = 5;
        // for (int i = 1; i <= n; i++) {
        //    char val='A';
        //    for (int star = 1; star <= i; star++){
        //         System.out.print(val+" ");
        //         val++;
                
        //     }
        //     System.out.println();
            
        // }

        
         for (int i = 0; i < n; i++) {
           char start = (char) ('E' - i);
           
             for (char ch = start; ch <= 'E'; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            
        }

       
    }
    
    
}
