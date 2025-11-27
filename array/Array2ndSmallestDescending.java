import java.util.Scanner;
public class Array2ndSmallestDescending
{
    public static void main(String args[])
    {
        int arr[]={10,30,40,20,50};

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[i]< arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
             }
                
                
        }
        System.out.println("the descending order of the arrays are");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int secondsmallest = arr[1];
        System.out.println("the second smallest number is : "+secondsmallest);
            
    }
}
