package day02;

public class T_Fpattern {
    public static void main(String[] args) {
        int n = 5;

        // Upper half
        for (int i = 1; i <= n; i++) {
            int val=(i%2==0)?0:1 ;
           
            for (int star = 1; star <= i; star++){
                System.out.print(val+" ");
                val=(val==1)?0:1 ;
            }
            System.out.println();
        }

       
    }
}

    

