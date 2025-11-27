public class ArrayLargest
{
    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50,60};

        int largest= arr[0];
        for(int i=1;i< arr.length; i++)
        {
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest + "is largest number");
    }
}