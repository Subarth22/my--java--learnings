class details{
    private String name;
    private int marks;

    details(String name, int marks)
    {
        this.name= name;
        this.marks=marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    
}

public class student {
    
        public static void main(String[] args) {
            details obj=new details("subarth", 99);
            System.out.println(obj.getName()+  " : "+ obj.getMarks());
        }
}
