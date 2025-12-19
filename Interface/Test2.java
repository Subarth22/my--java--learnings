enum Status
{
    Running, Pending, Failed , Success
}

public class Test2
{
    public static void main(String[] args)
    {
        Status s=Status.Success;

        if(s ==Status. Running)
        {
            System.out.println("All Good");
        }
        else if(s ==Status.Pending)
        {
            System.out.println("loading");
        }
        else if (s==Status.Failed)
        {
            System.out.println("ooops sorry");
        }
        else
        {
            System.out.println("done");
        }
    }
}