import java.util.Scanner;

public class Week6Pro7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a degree in Fahrenheir: ");
        double fahrenheir = input.nextDouble();

        double celsius = ((fahrenheir - 32.0) * 5 / 9.0);
        System.out.println(fahrenheir + " degree Fahrenheir is equal to " + celsius + " in Celsius");
    }
}
