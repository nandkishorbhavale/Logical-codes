import java.util.Scanner;

public class areaOfCircleFunction {
    public static int areaofcircle(int r) {
        int area = (int) (3.142 * r * r);
        return area;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the redius of the circle:");
        int r = sc.nextInt();
        System.out.println("Area of the circle is: " + areaofcircle(r));
    }
}
