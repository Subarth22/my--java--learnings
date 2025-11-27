import java.util.Scanner;
public class EvenTillN
{
    public static void main(String args[])
    {
        Scanner t= new Scanner(System.in);
        System.out.print("enter n ");
        int n=t.nextInt();
        int i=0;
        while(i<=n)
        {
            if(i % 2==0)
            {
            System.out.println(i);
            }
            i++;
        }
        
    
    }
}