
import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityTOArray {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> pq= new PriorityQueue<>();
        pq.add("red");
        pq.add("yellow");
        pq.add("green");
        pq.add("blue");
        System.out.println("Original Priority Queue : "+pq);

        String arr []=pq.toArray(new String[0]);
        System.out.println("Array containing all of the elements in the queue:");
        System.out.println(Arrays.toString(arr));
    }
}
