import java.util.ArrayList;


public class Clone
{
    public static void main(String[] args) {
        
        ArrayList<String> list1= new ArrayList<String>();
        
        list1.add("Red");
        list1.add("Green");
        list1.add("Orange");
        list1.add("White");
        list1.add("Blue");


        ArrayList<String> list2= (ArrayList<String> )list1.clone();

        System.out.println("Original array list : "+list1);
        System.out.println("Cloned array list : "+ list2);

    }
}