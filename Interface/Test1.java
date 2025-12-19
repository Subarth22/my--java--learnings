enum Days {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}


public class Test1
{
    public static void main(String[] args) 
    {
        Days [] dd= Days.values();
        

        for(Days d: dd)
        {
            System.out.println(d +":" + d.ordinal()  );
        }

    }
}