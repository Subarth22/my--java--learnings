import javax.sound.sampled.SourceDataLine;

class shape
{
    private int length;
    private int breadth;
    

    shape(int length, int breadth)
    {
            this.length=length;
            this.breadth=breadth;
    }

    public int getArea(){
        return length*breadth;
    }


    
}

public class rectangle {

    public static void main(String[] args) {
        shape obj=new shape(20, 30);
        System.out.println("area "+ obj.getArea());
    
    }
    
    

}
