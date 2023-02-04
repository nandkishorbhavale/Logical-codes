package loops;

import java.util.Scanner;

public class multiplicationInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which table you want: ");
        int num = sc.nextInt();
        for (int i = 10; i >= 0; i--) {
            System.out.println(i + "*" + num + "=" + i * num);
        }
        sc.close();
    }

}
