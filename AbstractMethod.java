import java.util.Scanner;

abstract class Multiply {
    public abstract int multyTwo(int num1, int num2);

    public abstract int multyThree(int num1, int num2, int num3);

    public void view() {
        System.out.println("This is how abstract method implemented and run!");
    }
}

public class AbstractMethod extends Multiply {
    public int multyTwo(int num1, int num2) {
        int multiplication = num1 * num2;
        return multiplication;
    }

    public int multyThree(int num1, int num2, int num3) {
        int multiplication = num1 * num2 * num3;
        return multiplication;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the Third number: ");
        int num3 = sc.nextInt();

        Multiply obj = new AbstractMethod();
        System.out.println("Multiplication of Two number is: " + obj.multyTwo(num1, num2));
        System.out.println("Multiplication of Three number is: " + obj.multyThree(num1, num2, num3));
        obj.view();
        sc.close();
    }
}