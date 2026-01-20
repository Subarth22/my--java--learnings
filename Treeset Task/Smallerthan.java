import java.util.TreeSet;

public class Smallerthan
{
    public static void main(String[] args) {
        
        TreeSet<Integer>list= new TreeSet<>();
        list.add(44);
        list.add(34);
        list.add(66);
        list.add(99);
        list.add(32);
        list.add(56);

        
        System.out.println("Less than or equal to 86 : "+list.floor(86));
         System.out.println("Less than or equal to 40 : "+list.floor(40));

    }
}