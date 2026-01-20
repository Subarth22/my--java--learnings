import java.util.TreeSet;

public class Retrive
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
        
        System.out.println("Removes the first(lowest) element: "+list.removeFirst());
        System.out.println("Tree set after removing first element:"+list);
        

    }
}