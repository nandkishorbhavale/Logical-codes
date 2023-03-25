
//write java program to find factorial of given number
import java.util.*;

public class factorial {
    public static void main(String[] args) {
        int num;
        int fact = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = input.nextInt();
        for (int i = 2; i <= num; i++) {
            fact = fact * i;
        }

        System.out.println("Factorial: " + fact);
        input.close();
    }
}

// public static void main(String[] args) {
// BigInteger num;
// BigInteger fact = BigInteger.valueOf(1);
// Scanner input = new Scanner(System.in);
// System.out.println("Enter a number: ");
// num = input.nextBigInteger();
// for (int i = 2; i <= num; i++){
// fact = fact.multiply(BigInteger.valueOf(i));
// }
// System.out.println(fact);
// }
