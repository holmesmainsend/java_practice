import java.util.HashMap;

public class hashmaps {
    public static void main (String args[]) {
        HashMap<String, Integer> gradebook = new HashMap<String, Integer>();

        gradebook.put("Math", 87);
        gradebook.put("History", 91);
        gradebook.put("English", 76);

        gradebook.putIfAbsent("History", 46);
        gradebook.putIfAbsent("Chemistry", 46);

        gradebook.replace("Math", 61);

        // System.out.println(gradebook.get("English"));
        // System.out.println(gradebook.get("Religion"));
        // System.out.println(gradebook.getOrDefault("Religion", -1));
        // System.out.println(gradebook.containsKey("Math"));
        // System.out.println(gradebook.containsValue(21));

        // gradebook.clear();

        gradebook.forEach((subject, score) -> {
            System.out.println(subject + ": " + (score * 10));
        });
        System.out.println(gradebook.toString());

        gradebook.forEach((subject, score) -> {
            gradebook.replace(subject, score * 10000);
        });
        System.out.println(gradebook.toString());
    }
}