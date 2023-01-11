import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        // GenericPrinter<Integer> printer1 = new GenericPrinter<>(38);
        // printer1.print();

        // GenericPrinter<Double> printer2 = new GenericPrinter<>(61.55559);
        // printer2.print();

        // GenericPrinter<String> printer3 = new GenericPrinter<>("Here is my string");
        // printer3.print();

        // exclaim(149, 2.7);
        // exclaim("Muffins", "Sorry for yelling");
        // exclaim(3.14, 24);

        List<Integer> intList = new ArrayList<>();
        intList.add(79999999);
        printList(intList);

        List<String> stringList = new ArrayList<>();
        stringList.add("Bagels");
        printList(stringList);
    }

    // Example of a generic method with multiple generic parameters
    private static <T, V> T exclaim(T thingToExclaim, V thingToApologize) {
        System.out.println(thingToExclaim + "!!! " + thingToApologize + " :(");
        return thingToExclaim;
    }

    // Example of using a wildcard, ?, which could also use the extends keyword
    private static void printList(List<?> myList) {
        System.out.println(myList);
    }
}