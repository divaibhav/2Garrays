/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Jul-20
 *  Time: 1:07 PM
 */

/*
sum of  all the elements of an array
 */
public class ArrayProcessing {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int sum = 0;
        //for loop to process each element
        for (int i = 0; i < arr.length; i++){
            sum = sum + arr[i];
        }
        System.out.println(" sum of all elements of an array = " + sum);
    }
}
