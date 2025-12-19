class primenumber
{
    public static boolean isprime(int n)
    {

        if(n<=1){
         return   false;
        }

        for(int i=2 ; i*i <=n;i++ )
        {
            if( n % 2==0){
                return false;
            }
        }
        return true;
        
    }


}

public class Prime
{
    public static void main(String[] args) {
        int a=5;

        primenumber calc =new primenumber();
        boolean result =calc.isprime(a);
        System.out.println(result);
    }
}

