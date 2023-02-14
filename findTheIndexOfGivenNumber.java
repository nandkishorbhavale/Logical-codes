import java.util.Scanner;

public class findTheIndexOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array you want to store: ");
        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter the element of the array:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the number you want to find it's index: ");
        int x = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (x == a[i]) {
                System.out.println("Index of " + x + " is:" + i);
            }
        }
        sc.close();
    }
}
