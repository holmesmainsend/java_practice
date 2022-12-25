import java.util.HashMap;

public class hashmaps {
    public static void main (String args[]) {
        HashMap<String, Integer> gradebook = new HashMap<String, Integer>();

        gradebook.put("Math", 87);
        gradebook.put("History", 91);
        gradebook.put("English", 76);

        gradebook.putIfAbsent("History", 46);
        gradebook.putIfAbsent("Chemistry", 46);

        // System.out.println(gradebook.get("English"));
        System.out.println(gradebook.toString());
    }
}