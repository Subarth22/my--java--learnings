public class Delete
{
    public static void main(String args[])
    {
        StringBuffer str= new StringBuffer("bonsaitree");
        System.out.println("before deleting : "+str);

        str=str.delete(2,6);
        System.out.println("after deleting: "+str);
    }
}