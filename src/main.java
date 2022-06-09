import java.util.*;
import java.io.*;


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



class ListOfNumbers {

        // create an integer array
        private int[] list = {5, 6, 8, 9, 2};

        // method to write data from array to a fila
        public void writeList() {
            PrintWriter out = null;

            try {
                System.out.println("Entering try statement");

                // creating a new file OutputFile.txt
                out = new PrintWriter(new FileWriter("OutputFile.txt"));

                // writing values from list array to Output.txt
                for (int i = 0; i < 7; i++) {
                    out.println("Value at: " + i + " = " + list[i]);
                }
            }

            catch (Exception e) {
                System.out.println("Exception => " + e.getMessage());
            }

            finally {
                // checking if PrintWriter has been opened
                if (out != null) {
                    System.out.println("Closing PrintWriter");
                    // close PrintWriter
                    out.close();
                }

                else {
                    System.out.println("PrintWriter not open");
                }
            }

        }
    }

    class ExceptionPrint  {
        public static void main(String[] args) {
            ListOfNumbers list = new ListOfNumbers();
            list.writeList();
        }
}
class  ReverseANumberUsingWhileLoop {

    public static void main(String[] args ){
     int Reverse = 0;

     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number : ");
     int Number = sc.nextInt();
     sc.close();

     while (Number != 0){
         int Remainder = Number % 10;
         Reverse = Reverse*10 + Remainder;
         Number = Number/10;
     }
     System.out.println("The Reverse of the Number is : " + Reverse);
    }
}

class  ReverseANumberUsingforLoop{
    public static void main(String[] args)
    {
        int reverse = 0 ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int Number = sc.nextInt();
        sc.close();

        for( ;Number != 0;
        Number=Number/10)
        {
            int remainder = Number % 10;
            reverse = reverse * 10 + remainder;
        }
        System.out.println("The reverse of the given number is: " + reverse);
    }
}

class FibonacciSeries {
     private static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }
    public static void main(String args[]){
        System.out.println("Enter the value of Count : ");
        Scanner sc = new Scanner(System.in);
         int count = sc.nextInt();
        sc.close();

        System.out.print(n1+" "+n2);
        printFibonacci(count-2);
    }
}