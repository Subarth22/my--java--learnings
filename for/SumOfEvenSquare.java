import java.util.Scanner;
public class SumOfEvenSquare
{
    public static void main(String args[])
    {
        Scanner t=new Scanner(System.in);
        System.out.print("enter n");
        int n=t.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++)
        {
            if(i % 2==0)
            {
                sum += i*i;

            }
        } 
        System.out.println(sum);
    }
}