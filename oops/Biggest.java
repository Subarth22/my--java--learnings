 class Bigger{
    public static int big(int a , int b)
    {
            return a > b ? a : b;
    }
}

public class Biggest
{
    public static void main(String[] args) {
        int n1=35;
        int n2=46;
        Bigger calc= new Bigger();
        int result=calc.big(n1, n2);
        System.out.println("bigger number is = "+ result);
    }
}
