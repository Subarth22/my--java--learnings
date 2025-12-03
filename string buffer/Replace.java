public class Replace
{
    public static void main(String args[])
    {
        StringBuffer str= new StringBuffer("hello world");
        str.replace(6,11,"java");
        System.out.println(str);
    }
}