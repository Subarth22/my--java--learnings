class brand
{

    private String name;
    private int model;
    private String  type;
    brand (String name , int model, String type)
    {
          this.name=name;
          this.model=model;
          this.type= type;

    }
    public String getName() {
        return name;
    }
    public int getModel() {
        return model;
    }
    public String getType() {
        return type;
    }
    
}

public class car
{
    public static void main(String args[])
    {
        brand obj= new brand("benz",2015,"sedan" );
        
        System.out.println(obj.getName());
         System.out.println(obj.getModel());
          System.out.println(obj.getType());

    }
}