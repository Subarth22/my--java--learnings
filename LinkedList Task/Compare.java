
import java.util.LinkedList;

public class Compare{
    
    public static void main(String[] args) {
        

        LinkedList<String> list1= new LinkedList<>();


        list1.add("red");
        list1.add("green");
        list1.add("Black");
        list1.add("white");
        list1.add("black");
   
        LinkedList<String> list2= new LinkedList<>();


        list2.add("red");
        list2.add("green");
        list2.add("Black");
        list2.add("white");
        list2.add("black");
        
    //   for(int i=0;i<list1.size();i++)
    //   {
    //     if(list1.get(i).equals(list2.get(i)))
    //     {
    //         System.out.println("yes");
    //     }
    //     else
    //     {
    //         System.out.println("No");
    //     }
    //   }


    LinkedList <String> result= new LinkedList<>();
    for(int i=0;i<list1.size();i++)
    {
        result.add(
            list1.get(i).equals(list2.get(i))?"yes":"No"
        );
    }
    System.out.println(result);
    }
}
