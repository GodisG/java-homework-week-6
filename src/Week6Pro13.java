import java.util.Scanner;

public class Week6Pro13 {
    public static void main(String[] args) {
        Scanner avrg = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        double num1 = avrg.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = avrg.nextDouble();
        System.out.println("Enter the third number: ");
        double num3 = avrg.nextDouble();
        avrg.close();
        System.out.println("The average of entered number is " + avrg(num1, num2, num3));
    }
    public static double avrg (double a, double b, double c)
    { return (a + b + c) / 3; }
}
