//function with argument + with return type

import java.util.Scanner;

class FunArgRet
{

static String display(String name, String vtu)
{
   
   return name+" "+vtu;

}
public static void main(String args[])
{
   Scanner sc=new Scanner(System.in);
   String name=sc.next();
   String vtu=sc.next();


  System.out.println(display(name,vtu));



}

}
