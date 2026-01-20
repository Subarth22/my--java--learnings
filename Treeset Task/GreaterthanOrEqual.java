import java.util.TreeSet;

public class GreaterthanOrEqual
{
    public static void main(String[] args) {
        
        TreeSet<Integer>list= new TreeSet<>();
        list.add(44);
        list.add(34);
        list.add(66);
        list.add(99);
        list.add(32);
        list.add(56);

        int givennumber=30;
        int secondnumber=45;
        Integer result= list.ceiling(givennumber);
         Integer result1= list.ceiling(secondnumber);

        System.out.println("Greater than or equal to "+givennumber +": "+result);
        System.out.println("Greater than or equal to "+secondnumber +": "+result1);
    }
}