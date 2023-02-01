import java.util.*;

public class Arrays2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows you want to store in arrays: ");
        int rows = sc.nextInt();
        System.out.println("Enter the columns you want to store int arrays: ");
        int cols = sc.nextInt();
        int matrix[][] = new int[rows][cols];
        // storing the element of the 2d arrys using nested loop
        // control rows
        System.out.println("Enter the elemets of your matrix: ");
        for (int i = 0; i < rows; i++) {
            // control columns
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // priting of the array
        System.out.println("Your give matrix Is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Enter the element you want to find it's index value: ");
        int x = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == x) {
                    System.out.println("index of given element is: (" + i + "," + j + ")");
                }
            }
        }
        sc.close();
    }
}
