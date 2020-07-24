/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 21-Jul-20
 *  Time: 1:42 PM
 */
//creating, initializing and print array

import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
        // declaring an array of size 5
        int[] marks = new int[5];
        // printing array using for loop, to check default values
        System.out.println("Default values");
        for(int i = 0; i < marks.length; i++){
            System.out.print(marks[i] + ",");
        }
        System.out.println();
        // initializing by user input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 5 integers");
        //reading user input
        for (int i = 0; i < marks.length; i++){
            marks[i] = sc.nextInt();
        }
        System.out.println();

        //printing array to check user input
        System.out.println("printing array to check user input");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + ",");
        }
        int[] temp = new int[]{10,20,30,40};
    }
}
