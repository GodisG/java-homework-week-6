import java.util.Scanner;

public class Week6Pro8 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the width of the Triangle: ");
        double w = s.nextDouble();

        System.out.println("Enter the height of the Triangle");
        double h= s.nextDouble();

        double area = (w*h)/2;
        System.out.println("Area of Triangle is: " +area);
    }
}
