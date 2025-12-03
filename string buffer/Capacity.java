public class Capacity
{
    public static void main(String args[])
    {
        StringBuffer str = new StringBuffer();
        str.append("This is a very long sentence to test capacity");
        System.out.println(str.capacity());
    }
}