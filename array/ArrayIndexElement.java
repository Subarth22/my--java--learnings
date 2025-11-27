import java.util.Scanner;
public class ArrayIndexElement
{
    public static void main(String [] args)
    {
        int arr[]={10,20,30,40,50,60};
        Scanner t= new Scanner(System.in);
        System.out.println("enter the number for the index :");
        int value=t.nextInt();
        int i;
        for( i=0;i <arr.length;i++)
        {
            if(arr[i]==value)
            {
                System.out.println(value +"for the index number is "+ i);
                break;
            }

        }

        if(i==arr.length)
        {
            System.out.println(value+"it is not extist");
        }

    }
}