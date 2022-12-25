import java.util.HashMap;

public class hashmaps {
    public static void main (String args[]) {
        HashMap<String, Integer> gradebook = new HashMap<String, Integer>();

        gradebook.put("String", 87);
        gradebook.put("History", 91);
        gradebook.put("English", 96);

        System.out.println(gradebook.get("English"));
    }
}