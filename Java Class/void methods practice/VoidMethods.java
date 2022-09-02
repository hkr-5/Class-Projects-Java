/* 
 * Hikaru Yamamoto
 * CS170
 * 04 09, 2020
 */

import java.lang.*;
import java.util.Random;

public class VoidMethods {
    public static void main(String[] args) {
        // test cases, array 1-3
        
        int array1[] = {23,43,12,45,75,32,12};
        int numOfElem1 = array1.length;
        
        int array2[] = {34,54,23,34,98,45,76,98,42,48,61,44};
        int numOfElem2 = array2.length;
        
        // next array will have random numbers
        Random generator = new Random(19580427);
        int array3[] = new int[20];
        int numOfElem3 = 10;    // will insert 10 elements only
        for (int i = 0; i < numOfElem3; ++i) {
            array3[i] = generator.nextInt(90) + 10;
        }
        
        // Call method printLargest for array1.
        print(array1, numOfElem1);
        printLargest(array1, numOfElem1);
        
        // Call method printLargest for array2.
        print(array2, numOfElem2);
        printLargest(array2, numOfElem2);
        
        // Call method printLargest for array3.
        print(array3, numOfElem3);
        printLargest(array3, numOfElem3);
        
        System.out.println();
        
        // Call method printAllEvens for array1.
        print(array1, numOfElem1);
        printAllEvens(array1, numOfElem1);
        
        // Call method printAllEvens for array2.
        print(array2, numOfElem2);
        printAllEvens(array2, numOfElem2);
        
        // Call method printAllEvens for array3.
        print(array3, numOfElem3);
        printAllEvens(array3, numOfElem3);
        
        System.out.println();
        
        // Call method printSum for array1.
        print(array1, numOfElem1);
        printSum(array1, numOfElem1);
        
        // Call method printSum for array2.
        print(array2, numOfElem2);
        printSum(array2, numOfElem2);
        
        // Call method printSum for array3.
        print(array3, numOfElem3);
        printSum(array3, numOfElem3);
        
        System.out.println();
        
        // Call method search to search 100 in array1.
        print(array1, numOfElem1);
        search(array1, numOfElem1, 100);
        
        // Call method search to search 44 in array2.
        print(array2, numOfElem2);
        search(array2, numOfElem2, 44);
        
        // Call method search to search 78 in array3.
        print(array3, numOfElem3);
        search(array3, numOfElem3, 78);
        
        // Call method search to search 45 in array1.
        print(array1, numOfElem1);
        search(array1, numOfElem1, 45);
    }
    

    // Definition of method print
    public static void print(int[] arr, int numOfElem) {
        System.out.print("Array: ");
        for(int i = 0; i < numOfElem; i++)
        System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    // Definition of method printLargest
    public static void printLargest(int[] arr, int numOfElem) {
        int largest = arr[0];
        for(int i = 1; i < numOfElem; i++) {
            if(largest < arr[i])
            largest = arr[i];
        }
        System.out.print("Largest element: ");
        System.out.print(largest);
        System.out.println();
    }
    
    // Definition of method printAllEvens
    public static void printAllEvens(int arr[], int numOfElem) {
        System.out.print("Even numbers: ");
        for(int i = 0; i < numOfElem; i++) {
            if(arr[i] % 2 == 0)
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // Definition of method printSum
    public static void printSum(int arr[], int numOfElem) {
        int sum = 0;
        for(int i = 0; i < numOfElem; i++) {
            sum += arr[i];
        }
        System.out.print("Sum: ");
        System.out.print(sum);
        System.out.println();
    }
    
    // Definition of method search
    public static void search(int arr[], int numOfElem, int search) {
        boolean end = true;
        int i = 0;
        while(end) {
            if(search == arr[i]) {
                end = false;
                System.out.print("Number " + search + " is in the array.");
            }
            else if(i == numOfElem - 1) {
                end = false;
                System.out.print("Number " + search + " is not in the array.");
            }
            i++;
        }
        System.out.println();
    }
    
}
