import java.util.Scanner;
public class Cprogram3
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the value of a :");
        int a=sc.nextInt();
         System.out.print("enter the value of b :");
        int b=sc.nextInt();
         System.out.print("enter the value of c :");
        int c=sc.nextInt();
         System.out.print("enter the value of d :");
        int d=sc.nextInt();

        int x=(a+b)*(c+d);
        System.out.println(("x=(a+b)*(c+d)= ")+x);
        
    }

}