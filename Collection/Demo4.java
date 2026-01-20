import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Demo4 {
    public static void main(String[] args) {
        Comparator<Integer> com= new Comparator<Integer>() 
        {
            public int compare(Integer i, Integer j)
            {
            if(i%10 > j%10)
            
                return 1;
            else
                return -1;
            }
            
        };
        List <Integer> nums= new ArrayList<>();

        nums.add(73);
        nums.add(99);
        nums.add(11);
        nums.add(34);

        Collections.sort(nums, com);
        for(int n:nums)
        System.out.println(n);

    }
}
