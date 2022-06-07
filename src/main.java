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