enum Status
{
    Running, Failed, Pending, Success
}

public class Test3 {
    

    public static void main(String[] args) {
        Status s= Status.Pending;

        switch (s) {
            case Running:
                    System.out.println("All good");
                break;

            case Failed:
                    System.out.println("oops sorry");
                break;
            case Pending:
                    System.out.println("it still loading");
                break;
            default:
                    System.out.println("it's completed");
                break;
        
          
        }
    }
}
