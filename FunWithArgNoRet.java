//function with argument + no return type


import java.util.Scanner;
class FunWithArgNoRet
{

static void display(String name,String vtu)
{
   System.out.println("name: "+name+" vtuno: "+vtu);

}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String name=sc.next();
String vtu=sc.next();

display(name,vtu);


}
}