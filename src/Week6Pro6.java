import java.util.Scanner;

public class Week6Pro6 {

    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");

        double radius = sc.nextDouble ();
        double area = Math.PI * (radius * radius);

        System.out.println("The area of the Circle is:   " +area);

    }
}
