public class EvenOrOdd {
    public static void number(int n){
        for(int i=0 ; i<=n ;i++)
        {
            if(i%2==0)
            {
                System.out.println(i+"it is even number");
            }else{
                System.out.println(i+"it is odd number");
            }
        }
    }

        public static void main(String[] args){
                number(25);
        }
    }
    
