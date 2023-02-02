import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int numCopy = num;
        int sum = 0;
        int count = 0;
        while (numCopy > 0) {
            count++;
            numCopy /= 10;
        }
        numCopy = num;
        while (numCopy > 0) { // 153
            int rem = numCopy % 10;
            int power = 1;
            for (int i = 0; i < count; i++) {
                power = power * rem;
            }
            sum = sum + power;
            numCopy /= 10;
        }
        if (sum == num) {
            System.out.println(num + " This is Armstrong number");
        } else
            System.out.println(num + " This is not Armstrong number");
        sc.close();
    }
}
