class FnDemo{
    void FnDemoObj(){

         System.out.println("Function demo using object");

    
    }
    static void FnDemoStat(){

         System.out.println("Function demo using Static keyword");

    
    }
    public static void main(String args[]){
         FnDemo obj=new FnDemo();
         obj.FnDemoObj();

         FnDemoStat();






}}