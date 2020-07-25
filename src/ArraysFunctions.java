/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 25-Jul-20
 *  Time: 1:22 PM
 */

import java.util.Arrays;
public class ArraysFunctions {
    public static void main(String[] args) {
        int[] arr = {140,10,32,120};
        String str = Arrays.toString(arr);
        System.out.println(str);
        System.out.println(Arrays.toString(arr));
        /*System.out.println("for loop");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");*/

        int[] brr = Arrays.copyOf(arr, 10);
        System.out.println("brr unsorted");
        System.out.println(Arrays.toString(brr));
/*
        int[] crr = Arrays.copyOfRange(arr, 1, 7);
        System.out.println("crr");
        System.out.println(Arrays.toString(crr));
        */
        Arrays.sort(brr);
        System.out.println("brr sorted");
        System.out.println(Arrays.toString(brr));
    }
}
