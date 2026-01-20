
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class Demo3 {
    

        public static void main(String[] args)
         {
            
            Set<Integer> nums= new TreeSet<Integer>();

            nums.add(21);
            nums.add(32);
            nums.add(44);
            nums.add(65);

           Iterator<Integer> values= nums.iterator();
           while(values.hasNext())
           {
            System.out.println(values.next());
           }
           
            
            
        }
}
