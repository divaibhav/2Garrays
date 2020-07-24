import java.util.Scanner;

/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Jul-20
 *  Time: 1:35 PM
 */
//implementting linear search
public class SearchingArray {

    public static void main(String[] args) {
        int[] arr = {9,5,4,77,8,88,11,15,16,12,14,174,18,3,1,515,2,61};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to search in array");
        int searchElement = sc.nextInt();
        boolean flag = false;
        // for loop to iterate over the array and compare each element with searchElement
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == searchElement){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }


}
