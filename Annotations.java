import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Annotations {
    public static void main(String[] args) {
        @SuppressWarnings("unused")
        Animal myAnimal = new Animal();

        if (myAnimal.getClass().isAnnotationPresent(VeryImportantCustomAnnotation.class)) {
            System.out.println("This thing is very important");
        }

        for(Method method : myAnimal.getClass().getDeclaredMethods()) {
            if(method.isAnnotationPresent(RunImmediately.class)) {
                try {
                    RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                    for(int i = 0; i < annotation.times(); i++) {
                        method.invoke(myAnimal);
                    }
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }

        for (Field field : myAnimal.getClass().getDeclaredFields()) {
            if(field.isAnnotationPresent(ImportantString.class)) {
                try {
                    Object objectValue = field.get(myAnimal);
                    if(objectValue instanceof String stringValue) {
                        System.out.println(stringValue.toUpperCase());
                    }
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }
}