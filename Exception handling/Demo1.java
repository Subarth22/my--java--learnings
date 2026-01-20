import java.util.*;
public class Demo1

{
    public static void main(String[] args)
    {
            Scanner sc= new Scanner(System.in);

        try
        {
            System.out.println("enter a number :");

            int num=sc.nextInt();

            System.out.println("you enteres : "+num);
        }

        catch(InputMismatchException e)
        {
            System.out.println("enter the integer value only");
        }

        finally
        {
            System.out.println("program excecution completed");
        }
    }
}
