public class ArrayTranspose
{
    public static void main(String args[])
    {
        int [][] matrix={
            {1,2,3},
            {4,5,6}
        };
        int rows=2;
        int cols=3;
        int [] [] transpose = new int [cols][rows];

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                transpose[j][i]= matrix[i][j];
            }
        }

          System.out.println("Original Matrix:");
        for(int i = 0; i < rows; i++) 
        {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print transpose matrix
        System.out.println("\nTranspose Matrix:");
        for(int i = 0; i < cols; i++) 
        {
            for(int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}