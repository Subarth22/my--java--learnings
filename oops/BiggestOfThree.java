import javax.sound.sampled.SourceDataLine;

class Bigger{
    public static int big(int a, int b, int c)
    {
        return (a>b && a>c) ? a:(b>c) ? b: c;
    }
}




public class BiggestOfThree {
    
    public static void main(String[] args) {
        int n1=33;
        int n2=34;
        int n3=200;

        Bigger run= new Bigger();
        int result = run.big(n1,n2,n3);
        System.out.println(result);
    }
}
