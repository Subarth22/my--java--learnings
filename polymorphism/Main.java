class A
{
    public void show()
    {
        System.out.println("in show A");
    }
}
 class B extends A
 {
    public void show()
    {
        System.out.println("in show B");
    }
 }

class D extends A
 {
    public void show()
    {
        System.out.println("in show D");
    }
 }



public class Main
{
    public static void main(String args[])  
    {
            A obj=new A();
            obj.show();

            obj=new B();
            obj.show();

            obj= new D();
            obj.show();


            
    }
}