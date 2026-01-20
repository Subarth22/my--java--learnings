import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;
public class Demo1
{
    public static void main(String[] args) 
    {
        
        List<Integer> nums= Arrays.asList(4,7,9,8,2,3);
        //this is for filter
        // Predicate<Integer> p= new Predicate<Integer>() 
        // {
        //     public boolean test(Integer n)
        //     {
        //         if(n%2==0)
        //             return true;
        //         else
        //             return false;
               
        //     }
        // };

        //next for the map
        // Function<Integer,Integer> fun= new Function<Integer,Integer>() 
        // {

            
        //     public Integer apply(Integer n) {
             
        //         return n*2;
        //     }
        
        // };
         int result=  nums.stream()
                        //.filter(p)
                       .filter(n-> n%2==0)
                       //map(fun)
                       .map(n->n*2)
                       .reduce(0,(a,b)->a+b);
        System.out.println(result);
    }
    

}
