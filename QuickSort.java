import java.util.Random;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));
    
        quickSort(numbers);
    
        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void quickSort(int[] inputArray) {
        quickSort(inputArray, 0, inputArray.length - 1);
    }

    private static void quickSort(int[] inputArray, int lowIndex, int highIndex) {
        if(lowIndex >= highIndex) {
            return;
        }

        int pivotIndex = new Random().nextInt(highIndex - lowIndex) + lowIndex;
        int pivot = inputArray[pivotIndex];
        swap(inputArray, pivotIndex, highIndex);

        int leftPointer = partition(inputArray, lowIndex, highIndex, pivot);

        quickSort(inputArray, lowIndex, leftPointer - 1);
        quickSort(inputArray, leftPointer + 1, highIndex);
    }

    private static int partition(int[] inputArray, int lowIndex, int highIndex, int pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while(leftPointer < rightPointer) {
            while(inputArray[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while(inputArray[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(inputArray, leftPointer, rightPointer);
        }
        swap(inputArray, leftPointer, highIndex);
        
        return leftPointer;
    }

    private static void swap(int[] inputArray, int index1, int index2) {
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }
}