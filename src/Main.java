import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

}

class Factorial {

    static int factorial( int n ) {
        if (n != 0)  // termination condition
            return n * factorial(n-1); // recursive call
        else
            return 1;
    }

    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
                int number = sc.nextInt();
                int result;
                sc.close();

        result = factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}
