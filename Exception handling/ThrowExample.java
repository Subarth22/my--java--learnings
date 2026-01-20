import java.util.Scanner;

public class ThrowExample
{
    public static void main(String[] args)
     {
        

        Scanner sc= new Scanner(System.in);

        try
        {
            System.out.println("enter the age: " );
            int age=sc.nextInt();

            if(age < 18)
            {

        
                throw new ArithmeticException("not eligible for vote");
            
            }
        System.out.println("eligible for vote");
        }

        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

        finally{
            sc.close();
        }
    }
}