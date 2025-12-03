public class Maximum {
    public static int max( int a, int b){
        return a>b ? a : b ;
    }
    public static double max( double a, double b){
        return a>b ? a: b ;
    }
    public static int max( int a, int b, int c){
        return (a>b && a>c) ? a : (b>c ? b:c);
    }
        

    public static void main(String[] args) {
        System.out.println(max(30,500));
        System.out.println(max(22.43, 43.54));
        System.out.println(max(20,400,2000));
    }
    
}
