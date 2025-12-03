public class Grade {
    public static void FindGrade(int marks){
        if(marks >=95){
            System.out.println("A grade");

        }else if(marks >=85){
            System.out.println("B grade");
        }else{
            System.out.println("C grade");
        }
        
    }

    public static void main(String args[]){
        FindGrade(77);
    }
}
