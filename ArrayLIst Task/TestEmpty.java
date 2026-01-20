import java.util.ArrayList;


public class TestEmpty
{
    public static void main(String[] args) {
        
        ArrayList<String> list= new ArrayList<String>();
        
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Blue");


        System.out.println(list);
        String col=list.isEmpty() ?"true":"false";
        System.out.println("Checking the above array list is empty or not! "+col);



        list.clear();
        String col1=list.isEmpty() ?"true":"false";
        System.out.println("Array list after remove all elements "+list);
        System.out.println("Checking the above array list is empty or not! "+col1);
    }
}