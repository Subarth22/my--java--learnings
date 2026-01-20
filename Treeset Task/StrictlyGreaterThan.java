import java.util.TreeSet;

public class StrictlyGreaterThan
{
    public static void main(String[] args) {
        
         TreeSet<Integer>list= new TreeSet<>();
        list.add(44);
        list.add(34);
        list.add(66);
        list.add(99);
        list.add(32);
        list.add(56);

        System.out.println("Strictly greater than 76 : "+list.higher(76));
        System.out.println("Strictly greater than 31 : "+list.higher(31));

    }
}