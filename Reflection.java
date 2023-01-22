import java.lang.reflect.Field;

// REFLECTION IS DANGEROUS AND SLOW
public class Reflection {
    public static void main(String[] args) throws Exception {
        Muffin firstMuffin = new Muffin("Blueberry", 6);
        Field[] muffinFields = firstMuffin.getClass().getDeclaredFields();

        for(Field field : muffinFields) {
            // System.out.println(field.getName());

            // Reflection works with calling private methods via method.invoke(), passing in null if it is a static method
            if(field.getName().equals("flavor")) {
                field.setAccessible(true);
                field.set(firstMuffin, "Granny Smith");
            }
        }

        System.out.println(firstMuffin.getFlavor());
    }
}