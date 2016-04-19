package arrays;

import java.util.Scanner;

/**
 * Created by justin on 4/18/2016.
 */
public class ArrayChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        System.out.println("Unsorted:");
        printArray(myIntegers);
        myIntegers = sortInts(myIntegers);
        System.out.println("Sorted:");
        printArray(myIntegers);
    }

    public static int[] getIntegers(int n) {
        int[] array = new int[n];
        for(int i = 0; i<array.length; i++) {
            System.out.println("Enter an integer: ");
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contains " + array[i]);
        }
    }

    public static int[] sortInts(int[] array) {
        int[] sortedArray = new int[array.length];


        System.arraycopy(array, 0, sortedArray, 0, array.length);

        boolean flag = true;
        int temp = 0;

        while(flag) {
            flag = false;

            for(int i=0; i<sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
