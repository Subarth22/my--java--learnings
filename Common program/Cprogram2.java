import java.util.Scanner;
public class Cprogram2
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of x: ");
        int x= sc.nextInt();
         System.out.print("enter the value of y: ");
        int y= sc.nextInt();
         System.out.print("enter the value of m: ");
        int m= sc.nextInt();
         System.out.print("enter the value of n: ");
        int n= sc.nextInt();

        int v=(x+y)/(m*n);
        System.out.println(("v=(x+y)/(m*n) =")+v);


    }
}