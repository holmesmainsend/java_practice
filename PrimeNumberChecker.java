import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {

        List<Integer> primeNumbers = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter upper integer boundary for prime check: ");
        int userInput = scan.nextInt();

        for(int numberToCheck = 2; numberToCheck <= userInput; numberToCheck++) {
            boolean isPrime = true;
            for(int factor = 2; factor <= numberToCheck / 2; factor++) {
                if(numberToCheck % factor == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                primeNumbers.add(numberToCheck);
            }
        }

        System.out.printf("Prime numbers from 1 to %d are: \n", userInput);
        for(int prime : primeNumbers) {
            System.out.println(prime);
        }
    }
}
