import java.util.TreeSet;

public class Remove
{
    public static void main(String[] args) {
        
         TreeSet<Integer>list= new TreeSet<>();
        list.add(44);
        list.add(34);
        list.add(66);
        list.add(99);
        list.add(32);
        list.add(56);

        System.out.println("Original tree set : "+list);
        
        boolean result=list.remove(99);
        System.out.println("Removes 99 from the list:"+result);
        System.out.println("after removing: "+list);
        

    }
}