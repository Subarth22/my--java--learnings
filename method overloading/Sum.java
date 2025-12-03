 public class Sum{
    public static int add( int a, int b){
        return a+b;
    }
    public static int add( int a, int b, int c){
        return a+b+c;

    }
    public static int add( int a, int b, int c, int d){
        return a+b+c+d;

    }
    public static void main(String[] args) {
        System.out.println(add(10,20));
        System.out.println(add(20,40,70));
        System.out.println(add(60,20,100,230));
    }
}