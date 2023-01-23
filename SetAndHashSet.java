import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class SetAndHashSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Jeffrey");
        names.add("Jim");
        names.add("James");
        names.add("Jack");
        names.add("Jenkins");

        // Sets do not allow duplicate values
        names.add("Jeffrey");

        // Cannot remove by index for HashSets, since unordered
        names.remove("Jack");


        // System.out.println(names);
        // System.out.println(names.size());
        // System.out.println(names.contains("Bob"));
        // System.out.println(names.isEmpty());

        // for(String name : names) {
        //     System.out.println(name);
        // }

        // names.forEach(System.out::println);

        // Iterator<String> namesIterator = names.iterator();
        // while(namesIterator.hasNext()) {
        //     System.out.println(namesIterator.next());
        // }

        // names.clear();
        // System.out.println(names);

        List<Integer> numberList = new ArrayList<>();
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(2);
        numberList.add(2);

        // Set<Integer> numberSet = new HashSet<>();
        // numberSet.addAll(numberList);
        // System.out.println(numberSet);

        Set<Integer> numberSet = new HashSet<>(numberList);
        System.out.println(numberSet);

        // Use TreeSet<>() instead of HashSet<>() to put elements in their natural order; however TreeSet<>() is far slower than HashSet<>()

        // Use LinkedHashSet<>() instead of HashSet<>() to maintain insertion order of elements; slightly slower than HashSet<>()
    }
}