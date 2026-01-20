

import java.util.LinkedList;



public class Join
{
    
    public static void main(String[] args) {
        

        LinkedList<String> list1= new LinkedList<>();

        list1.add("red");
        list1.add("green");
        list1.add("Black");
       System.out.println("List of first linked list: "+list1);
     
        LinkedList<String> list2= new LinkedList<>();

        list2.add("orange");
        list2.add("pink");
        list2.add("burgandy");
        System.out.println("List of second linked list:"+list2);
        list1.addAll(list2);
        System.out.println("New linked list : "+list1);
    }
}
