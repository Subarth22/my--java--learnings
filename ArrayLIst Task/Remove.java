import java.util.ArrayList;


public class Remove
{
    public static void main(String[] args) {
        
        ArrayList<String> col= new ArrayList<String>();
        
        col.add("Red");
        col.add("Green");
        col.add("Orange");
        col.add("White");
        col.add("Blue");


        System.out.println(col);

        System.out.println("After removing third element from the list:");
        col.remove(2);
        System.out.println(col);
    }
}