import java.util.Scanner;
public class SpCalculation
{
    public static void main(String[]args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter value of x: ");
        int x=sc.nextInt();
        System.out.print("enter value of y: ");
        int y=sc.nextInt();

        int sp=(x+y)+x;
        System.out.println(("sp=(x+y)+x = ")+sp);
    }
}