package bjs.task12;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter expression:");
        String expression = in.nextLine();

        Calculator calc = new Calculator();
        calc.calcExpression(expression);

        System.out.println("\nPrint result array:");
        calc.printCalculationResults();

        System.out.println(10.2d + 6.6d);

        /*Output is:
        10.2+6.6

        Expression result: 16.799999999999997

        Print result array:
        SUM: 16.799999999999997,
        */
    }
}
