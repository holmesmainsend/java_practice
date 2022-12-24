import java.util.ArrayList;
import java.util.Comparator;

public class arraylists {
    public static void main (String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);

        // numbers.remove(1);
        // numbers.remove(Integer.valueOf(2));
        // numbers.clear();
        // numbers.set(2, 9);
        numbers.sort(Comparator.naturalOrder());

        numbers.forEach(number -> {
            System.out.println(number * number);
        });

        System.out.println(numbers.toString());
        // System.out.println(numbers.get(2));
        // System.out.println(numbers.size());
        // System.out.println(numbers.contains(Integer.valueOf(2)));
        // System.out.println(numbers.contains(Integer.valueOf(50)));
        // System.out.println(numbers.isEmpty());
    }
}