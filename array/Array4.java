import java.util.Scanner;

public class Array4 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to search: ");
        int value = sc.nextInt();

        int i; // declare index outside
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.println(value + " exists in the array.");
                break; // exit the loop when found
            }
        }

        // If loop completed without finding value
        if (i == arr.length) {
            System.out.println(value + " does NOT exist in the array.");
        }

        sc.close();
    }
}
