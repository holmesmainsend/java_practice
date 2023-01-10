import java.util.Random;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));

        insertionSort(numbers);

        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));
    }

    private static void insertionSort(int[] inputArray) {
        for(int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];

            int j = i - 1;
            while(j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }
}