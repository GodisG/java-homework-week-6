public class Week6Pro5 {
    int a = 20;
    int b = 5;
    static int c = 9;
    static int d = 3;

    public void addition (){
        Week6Pro5 add = new Week6Pro5();
        Week6Pro5 sub = new Week6Pro5();
                System.out.println(a+b);
        System.out.println(add.c-sub.d);
    }
public static void multi (){
    Week6Pro5 mul = new Week6Pro5();
    Week6Pro5 div = new Week6Pro5();
    System.out.println(c*d);
    System.out.println(mul.a/div.b);
}
    public static void main(String[] args) {
        Week6Pro5 sum = new Week6Pro5();
        Week6Pro5 sums = new Week6Pro5();

        System.out.println("First Variable is "+sum.a+" and Second variable is "+sums.b);
        System.out.println("addition of first variable "+sum.a+" and Second variable "+sums.b+ " is " +(sum.a+sums.b));
        System.out.println("Division of first variable "+sum.a+" and Second variable "+sums.b+ " is " +(sum.a/sums.b));

        System.out.println("Third Variable is "+c+" and Fourth variable is "+d);
        System.out.println("Multiplication of Third variable "+c+" and Fourth variable "+d+ " is " +(c*d));
        System.out.println("Subtraction of Third variable "+c+" and Fourth variable "+d+ " is " +(c-d));
        }
}
