class calculator
{
    public static int add(int a, int b)
    {
        return a+b;
    }
}

public class ClassDemo
{
    public static void main(String args[])
    {
        calculator calc = new calculator();
        int result=calc.add(20,40 );


        System.out.println("sum = "+ result);
    }
}