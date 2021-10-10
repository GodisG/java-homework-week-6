import java.util.Scanner;

public class Week6Pro10 {
    public static void main(String[] args) {
        Scanner tb = new Scanner(System.in);

        System.out.println("Input a number");
        int num1 = tb.nextInt();

        for (int i=0; i< 10; i++) {
            System.out.println(num1 + " x " + (i+1) + " = " + (num1 * (i+1)));
        }
    }
}
