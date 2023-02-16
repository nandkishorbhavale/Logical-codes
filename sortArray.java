import java.util.Arrays;
import java.util.Scanner;

public class sortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array in you want to store in array: ");
        int size = sc.nextInt();
        System.out.println("Enter the Arrya element: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Sorted array is: ");
        Arrays.sort(arr);
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}
