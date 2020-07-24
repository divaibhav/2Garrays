/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 24-Jul-20
 *  Time: 1:38 PM
 */
// Accept 2 numbers from command line and print there sum
public class CommandLineSum {
    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int sum = number1 + number2;
        System.out.println("sum = " + sum);
    }
}
