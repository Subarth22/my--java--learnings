import java.util.ArrayList;


public class Position
{
    public static void main(String[] args) {
        
        ArrayList<String> list= new ArrayList<String>();
        
        list.add("Red");
        list.add("Green");
        list.add("Orange");
        list.add("White");
        list.add("Blue");


        System.out.println("Original array list : "+list);
        System.out.println("Print using index of an element:");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

    }
}