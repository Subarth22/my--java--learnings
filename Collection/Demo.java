import java.util.ArrayList;
import java.util.Collection;
public class Demo
{
    public static void main(String[] args) {
        
        Collection <Integer> nums = new ArrayList<Integer>();
        nums.add(3);
        nums.add(6);
        nums.add(12);
        nums.add(2);
        
     

        for(int n:nums)
        {   
            
            System.out.println(n);
        }
    }
}