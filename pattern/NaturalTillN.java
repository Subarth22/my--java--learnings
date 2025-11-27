import java.util.Scanner;
public class NaturalTillN
{
    public static void main(String []args)
    {
        Scanner t= new Scanner(System.in);
        System.out.print("enter the number n : ");
        int n=t.nextInt();
        int i=1;
        while(i<=n)  
        {
            System.out.println(i);
            i++;
        }

    }   
}