//java program of How we can find Elements in given matrix
import java.util.Scanner;

public class FindinigElementsInMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the cols: ");
        int cols = sc.nextInt();
        System.out.println("Enter the element of the matrix: ");
        int[][] matrix = new int[rows][cols];
        // storing arrys in matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the matrix element you want to find it's index: ");
        int find = sc.nextInt();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == find) {
                    System.out.println(find + " This elements occures at the index of: " + i + "," + j);
                }
            }
        }

    }
}
