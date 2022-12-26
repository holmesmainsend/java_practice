import java.time.LocalDate;

public class oop {
    public static void main (String args[]) {
        User youngerUser = new User();

        youngerUser.name = "Bobbyjoe";
        youngerUser.birthDate = LocalDate.parse("1999-03-13");

        System.out.printf("Hello %s, our records show your birthdate is %s \n", youngerUser.name, youngerUser.birthDate);
    }
}