import java.util.ArrayList;
import java.util.Collections;


public class Sort
{
    public static void main(String[] args) {
        
        ArrayList<String> col= new ArrayList<String>();
        
        col.add("Red");
        col.add("Green");
        col.add("Orange");
        col.add("White");
        col.add("Blue");

        System.out.println("col before sort "+col);
        Collections.sort(col);
        System.out.println("col after sort "+ col);
    }
}