public class Arrays {
    public static void print(int []arr)
    {
        for(int n :arr )System.out.println(n);
    }
    public static void print(String []arr)
    {
        for(String s: arr)System.out.println(s);
    }

    public static void main(String args[])
        {
            print(new int[]{1,2,3});
            print(new String[]{"a","b","c"});
        }
    
}
