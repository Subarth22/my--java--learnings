import java.util.Scanner;
public class Biggest
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the number A : ");
        int A=sc.nextInt();
        System.out.print("enter the number B : ");
        int B=sc.nextInt();
        if(A>B)
        {
            System.out.println(A+" is biggest");
        }
    if(B>A)
        {
            System.out.println(B+" is bigggest");
        }

    }
}
