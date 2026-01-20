import java.util.HashSet;
import java.util.Set;
public class Demo2 {
    

        public static void main(String[] args) {
            
            Set<Integer> nums= new HashSet<Integer>();

            nums.add(21);
            nums.add(32);
            nums.add(44);
            nums.add(65);

            for(int n:nums)
            {
                System.out.println(n);
            }
            
            
        }
}
