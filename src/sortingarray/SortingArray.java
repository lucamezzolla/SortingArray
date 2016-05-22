package sortingarray;

import java.util.Scanner;

/**
 *
 * @author Luca Mezzolla
 */
public class SortingArray {
    
    private int[] sortingArray(int a[]) {
        for(int i = 0; i < a.length -1; i++) {
            for(int j = a.length - 1; j > i; j--) {
                if(a[i] > a[j]) {
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a;
    }
    
    private void printArray(String initialString, int a[]) {
        System.out.print(initialString);
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " | ");
        }
        System.out.print("\n");
    }
    
    private void run() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Set size of the array: ");
        int size = reader.nextInt();
        int array[] = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Put a number to the array: ");
            array[i] = reader.nextInt();
        }
        printArray("Array: ", array);
        int sortedArray[] = sortingArray(array);
        printArray("Sorted Array: ", sortedArray);
        System.out.println("Minimum value: "+sortedArray[0]);
        System.out.println("Maximum value: "+sortedArray[sortedArray.length-1]);
    }

    public static void main(String[] args) {
        new SortingArray().run();
    }
    
}
