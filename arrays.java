import java.util.Arrays;

public class arrays {
    public static void main (String args[]) {
        char[] vowels = new char[5];
        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        System.out.println(Arrays.toString(vowels));

        char[] lastLetters = {'z', 'y', 'x'};
        Arrays.sort(lastLetters);
        System.out.println(Arrays.toString(lastLetters));

        int foundItemIndex = Arrays.binarySearch(vowels, 'o');
        System.out.println(foundItemIndex);
    }
}
