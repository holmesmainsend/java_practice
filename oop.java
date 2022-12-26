public class oop {
    public static void main (String args[]) {
        User youngerUser = new User("Bobbyjoe", 1999);

        // youngerUser.name = "Bobbyjoe";
        // youngerUser.birthYear = 1999;

        // System.out.printf("Hello %s, our records show that your birth year is %d making your current age approximately %d \n", youngerUser.name, youngerUser.birthYear, youngerUser.currentAge());

        System.out.printf("Hello %s, our records show that your birth year is %d making your current age approximately %d.\n", youngerUser.getName(), youngerUser.getBirthYear(), youngerUser.currentAge());
    }
}