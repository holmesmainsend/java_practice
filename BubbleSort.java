import java.util.Random;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
        System.out.println("Before: ");
        System.out.println(Arrays.toString(numbers));

        boolean swappedSomething = true;
        while(swappedSomething) {
            swappedSomething = false;
            for(int i = 0; i < numbers.length - 1; i++) {
                if(numbers[i] > numbers[i + 1]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swappedSomething = true;
                }
            }
        }

        System.out.println("After: ");
        System.out.println(Arrays.toString(numbers));
    }
}