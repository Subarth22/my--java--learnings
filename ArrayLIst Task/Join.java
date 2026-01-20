import java.util.ArrayList;

public class Join {
    
    public static void main(String[] args) {
        
        ArrayList<String> list1= new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");

        System.out.println("List of first array : "+list1);
         ArrayList<String> list2= new ArrayList<>();
        list2.add("5");
        list2.add("6");
        list2.add("7");
        list2.add("8");

        System.out.println("List of second array : "+ list2);

        list1.addAll(list2);
        System.out.println("new array : " +list1 );

    }
}
