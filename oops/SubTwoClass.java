
class Minus{
    public static int sub(int a , int b)
    {
        int  r = a-b;
        return r;
    }
}




public class SubTwoClass {
    public static void main(String[] args) {

        int n1=50;
        int n2=30;
        Minus calc= new Minus();
        int result= calc.sub(n1,n2);
        System.out.println("sub = "+result);
    }
}
