
package exception;

import java.util.*;

public class Exception1 {

    public static void main(String[] args) {
        int number ;

       boolean done = false;

        do {
            try {
                Scanner input = new Scanner(System.in);
                    System.out.println("Give me an integer?");
                    int n1 = input.nextInt();
                    System.out.println("Give me second integer number?");
                    int n2 = input.nextInt();
                    double sum = n1 / n2;
                    System.out.println(sum);
                    done = true;


                    if (sum < 1.0 || sum > 100.0) throw new ArithmeticException();


                } catch(ArithmeticException ae ){
                    System.out.println("Out of range");
                   done = false;
                } catch(Exception e){
                    System.out.println("You didn't give an integer value");
            }

            }

            while (!done);          




   }

}

