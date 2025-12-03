public class Reverse 
{
    public static int rev(int n)
    {
        int r=0;
        while(n>0)
        {
            r=r*10+ n%10;
            n=n/10;
        }
        return r;
    }
    
    public static String rev(String s)
    {
            String rev=" ";
            for(int  i=s.length()-1; i>=0 ;i--)
            {
                 rev += s.charAt(i);
            }
        return rev;
    }


     public static void main(String[] args) 
     {
        System.out.println(rev(1234));   
        System.out.println(rev("Java"));
     }
}
