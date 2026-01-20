@FunctionalInterface
 interface A {

    int add(int i, int j);
}

public class Add
{
    public static void main(String args[])
    {
        A obj= (i, j) ->i+j ;

        int result= obj.add(10, 20);
        System.out.println(result);
    }
}