public class EvenOrOddAndChar
{
    public static String check(int n)
    {
        return (n%2==0) ? "even" : "odd";
    }
    public static boolean check(char c)
    {
        return "aeiouAEIOU".indexOf(c) !=-1;
    }

    public static void main(String[] args) {
        System.out.println(check(55));
        System.out.println(check('d'));
    }
}
