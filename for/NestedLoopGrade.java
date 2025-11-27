import java.util.Scanner;
public class NestedLoopGrade
{
    public static void main(String agrs[])
    {
        Scanner t= new Scanner(System.in);
        System.out.print("enter number of students");
        int students=t.nextInt();
        System.out.print("enter number of subjects");
        int subjects=t.nextInt();

        for(int i=1 ; i<=students ; i++)
        {
            System.out.println("students : "+ i);
            

            for(int j=1; j<=subjects; j++)
            {
                System.out.print("enter marks for subjects : " +j);
                int marks=t.nextInt();


                if(marks >=90)
                {
                    System.out.println("grade :A");
                }
                else if(marks >=80)
                {
                    System.out.println("grade:B");
                }
                else if(marks >=70)
                {
                    System.out.println("grade:B");
                }
                else if(marks >=60)
                {
                    System.out.println("grade:B");
                }
                else{
                    System.out.println("grade f");
                }
            }

        }
    }
}