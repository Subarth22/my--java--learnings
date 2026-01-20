import java.util.TreeSet;

public class FindNumber {
    

    public static void main(String[] args) {
        
          TreeSet<Integer>list= new TreeSet<>();
          list.add(1);
           list.add(2);
            list.add(3);
             list.add(4);
              list.add(5);
               list.add(6);
                list.add(7);
                 list.add(8);

                 System.out.println("Tree set data:");

                 for(int num:list.headSet(7))
                 {
                 System.out.println(num);
                 }

    }
}
